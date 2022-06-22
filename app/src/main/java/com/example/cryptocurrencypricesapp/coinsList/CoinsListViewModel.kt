package com.example.cryptocurrencypricesapp.coinsList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptocurrencypricesapp.network.Coin
import com.example.cryptocurrencypricesapp.network.MarketsApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.await

enum class MarketsApiStatus {LOADING , ERROR , DONE}

class CoinsListViewModel :ViewModel() {

    private val _status = MutableLiveData<MarketsApiStatus>()

    val status : LiveData<MarketsApiStatus>
    get() = _status

    private val _coins = MutableLiveData<List<Coin>>()

    val coins : LiveData<List<Coin>>
    get() = _coins

    private val _navigateToSelectedCoin = MutableLiveData<Coin?>()

    val navigateToSelectedCoin : MutableLiveData<Coin?>
        get() = _navigateToSelectedCoin

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)


init {
    getMarkets()
}

    private fun getMarkets() {
        coroutineScope.launch {
            var getMarketsDeferred = MarketsApi.retrofitService.getMarketsList()

            try {
                _status.value = MarketsApiStatus.LOADING
                var listResult = getMarketsDeferred.await()
                _status.value = MarketsApiStatus.DONE
                if (listResult.isNotEmpty())
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