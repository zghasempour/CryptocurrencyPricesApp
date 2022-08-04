package com.example.cryptocurrencypricesapp.search

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cryptocurrencypricesapp.network.Coin

/**
 * Simple ViewModel factory that provides the MarsProperty and context to the ViewModel.
 */
class SearchCoinViewModelFactory(
        private val coin: String,
        private val application: Application) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SearchCoinViewModel::class.java)) {
            return SearchCoinViewModel(coin, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
