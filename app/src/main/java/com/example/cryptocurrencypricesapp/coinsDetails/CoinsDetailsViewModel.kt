package com.example.cryptocurrencypricesapp.coinsDetails

import android.app.Application
import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.*
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.coinsList.MarketsApiStatus
import com.example.cryptocurrencypricesapp.network.Coin
import com.example.cryptocurrencypricesapp.network.MarketsApi
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.await
import kotlin.math.roundToInt

class CoinsDetailsViewModel(coin : Coin, app : Application) :AndroidViewModel(app) {
    private val _selectedCoin = MutableLiveData<Coin>()

    private val _status = MutableLiveData<MarketsApiStatus>()

    val status : LiveData<MarketsApiStatus>
        get() = _status

    val selectedCoin : LiveData<Coin>
    get() = _selectedCoin

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init{
        _selectedCoin.value = coin
       // loadData()

    }
    private val _data: MutableLiveData<List<Entry>> by lazy {
        MutableLiveData<List<Entry>>().also {
            loadData()
        }
    }
    val data : LiveData<List<Entry>>
     get()=_data

    val displayPropertyPrice = Transformations.map(selectedCoin) {
        app.applicationContext.getString(R.string.display_price, it.current_price)
    }

    private fun loadData() {

        coroutineScope.launch {
            val getMarketsDeferred = MarketsApi.retrofitService.getMarketsHistoryList(
                _selectedCoin.value!!.id,
                "usd",2)

            try {
                _status.value = MarketsApiStatus.LOADING
                val listResult = getMarketsDeferred.await()
                _status.value = MarketsApiStatus.DONE
                if (!listResult.equals(null))
                {
                    val barData = listResult.prices.flatten()
                    lateinit var lineData : Entry
                    val barData2 : MutableList<Entry> = mutableListOf()
                    for (i in 0..49 step 2)
                    {


                        lineData = Entry(barData[i], barData[i+1])
                        barData2.add(lineData)

                    }
                    Log.i(TAG, "failure: $barData2[3]")
                    _data.postValue(barData2)

                }

            }catch (t:Throwable){
                _status.value = MarketsApiStatus.ERROR
            }



        }
    }

   /* fun fetchPrices() {
        val seriesDataList = data.value?.list
        minimumPrice = (seriesDataList?.get(0) as LineData).value
        maximumPrice = minimumPrice
        for (i in seriesDataList.indices) {
            val price = (seriesDataList[i] as LineData).value
            if (price > maximumPrice) {
                maximumPrice = price
            }
            if (price < minimumPrice) {
                minimumPrice = price
            }
        }
        avgPrice = (maximumPrice + minimumPrice) / 2
    }*/



}