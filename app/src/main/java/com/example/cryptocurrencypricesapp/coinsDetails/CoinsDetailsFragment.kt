package com.example.cryptocurrencypricesapp.coinsDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cryptocurrencypricesapp.databinding.FragmentCoinsDetailsBinding

class CoinsDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val application = requireNotNull(activity).application
        val binding = FragmentCoinsDetailsBinding.inflate(inflater)
        binding.lifecycleOwner = this
         val coin = CoinsDetailsFragmentArgs.fromBundle(arguments!!).selectedCoin
        val viewModelFactory = CoinDetailViewModelFactory(coin,application)

        binding.viewModel = ViewModelProvider(
            this, viewModelFactory).get(CoinsDetailsViewModel::class.java)


        return binding.root
    }

}