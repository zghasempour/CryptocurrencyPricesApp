package com.example.cryptocurrencypricesapp.coinsDetails

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.network.Coin

class CoinsDetailsViewModel(coin : Coin, app : Application) :AndroidViewModel(app) {
    private val _selectedCoin = MutableLiveData<Coin>()

    val selectedCoin : LiveData<Coin>
    get() = _selectedCoin
    init{
        _selectedCoin.value = coin
    }
    val displayPropertyPrice = Transformations.map(selectedCoin) {
        app.applicationContext.getString(R.string.display_price, it.current_price)
    }

}