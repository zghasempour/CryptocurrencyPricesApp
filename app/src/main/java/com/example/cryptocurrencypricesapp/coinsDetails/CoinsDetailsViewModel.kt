package com.example.cryptocurrencypricesapp.coinsDetails

import android.app.Application
import androidx.lifecycle.*
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.StaticRepository
import com.example.cryptocurrencypricesapp.coinsList.MarketsApiStatus
import com.example.cryptocurrencypricesapp.network.Coin
import com.example.cryptocurrencypricesapp.network.Data
import com.example.cryptocurrencypricesapp.network.MarketsApi
import com.tradingview.lightweightcharts.api.series.enums.SeriesType
import com.tradingview.lightweightcharts.api.series.models.LineData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.await

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
            getMarkets()
        _selectedCoin.value = coin

    }

    private fun getMarkets() {
        coroutineScope.launch {
            var getMarketsDeferred = MarketsApi.retrofitService.getMarketsHistoryList()

            try {
                _status.value = MarketsApiStatus.LOADING
                var listResult = getMarketsDeferred.await()
                _status.value = MarketsApiStatus.DONE
                if (listResult.equals(null))
                {
                    _coins.value = listResult
                }

            }catch (t:Throwable){
                _status.value = MarketsApiStatus.ERROR
            }



        }
    }

    val displayPropertyPrice = Transformations.map(selectedCoin) {
        app.applicationContext.getString(R.string.display_price, it.current_price)
    }


    private val staticRepository = StaticRepository()

    var minimumPrice: Float = 0f
    var maximumPrice: Float = 0f
    var avgPrice: Float = 0f

    val seriesData: LiveData<Data>
        get() = data

    private val data: MutableLiveData<Data> by lazy {
        MutableLiveData<Data>().also {
            loadData()
        }
    }

    private fun loadData() {
        viewModelScope.launch {
            val barData = staticRepository.getPriceLinesWithTitlesSeriesData()
            data.postValue(Data(barData, SeriesType.LINE))
        }
    }

    fun fetchPrices() {
        val seriesDataList = data.value?.list
        minimumPrice = (seriesDataList?.get(0) as LineData).value
        maximumPrice = minimumPrice;
        for (i in seriesDataList.indices) {
            val price = (seriesDataList[i] as LineData).value;
            if (price > maximumPrice) {
                maximumPrice = price;
            }
            if (price < minimumPrice) {
                minimumPrice = price;
            }
        }
        avgPrice = (maximumPrice + minimumPrice) / 2;
    }



}