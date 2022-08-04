package com.example.cryptocurrencypricesapp.search

import android.app.Application
import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.*
import com.example.cryptocurrencypricesapp.market.MarketsApiStatus
import com.example.cryptocurrencypricesapp.network.Coin
import com.example.cryptocurrencypricesapp.network.Coins
import com.example.cryptocurrencypricesapp.network.MarketsApi
import com.github.mikephil.charting.data.Entry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.await

enum class MarketsApiStatus {LOADING , ERROR , DONE}


class SearchCoinViewModel(coin : String, app : Application) :AndroidViewModel(app) {
    private val _selectedCoin = MutableLiveData<String>()

    private val _status = MutableLiveData<MarketsApiStatus>()

    val status : LiveData<MarketsApiStatus>
        get() = _status

    val selectedCoin : LiveData<String>
    get() = _selectedCoin


    private val _coins = MutableLiveData<Coins>()

    val coins : LiveData<Coins>
        get() = _coins

    private val _navigateToSelectedCoin = MutableLiveData<Coin?>()

    val navigateToSelectedCoin : MutableLiveData<Coin?>
        get() = _navigateToSelectedCoin


    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init{
        _selectedCoin.value = coin
        loadData()
    }

    private fun loadData() {

        coroutineScope.launch {
            val findCoinDeferred = MarketsApi.retrofitService.findCoin(_selectedCoin.value.toString())

            try {
                _status.value = MarketsApiStatus.LOADING
                var listResult = findCoinDeferred.await()
                _status.value = MarketsApiStatus.DONE
                if (!listResult.equals(null))
                {
                    _coins.value = listResult
                }

            }catch (t:Throwable){
                _status.value = MarketsApiStatus.ERROR
            }



        }
    }
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
    fun displayCoinDetails(coin: Coin){
        _navigateToSelectedCoin.value = coin
    }

    fun displayCoinDetailsComplete(){
        _navigateToSelectedCoin.value = null
    }



}