package com.example.cryptocurrencypricesapp.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cryptocurrencypricesapp.coinsDetails.CoinDetailViewModelFactory
import com.example.cryptocurrencypricesapp.coinsDetails.CoinsDetailsViewModel
import com.example.cryptocurrencypricesapp.databinding.FragmentSearchBinding
import com.example.cryptocurrencypricesapp.market.CoinsListFragmentDirections
import com.example.cryptocurrencypricesapp.market.CoinsListViewModel
import com.example.cryptocurrencypricesapp.market.ListGridAdapter

class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private lateinit var coin : String
    private lateinit var viewModel: SearchCoinViewModel
    private lateinit var viewModelFactory: SearchCoinViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val application = requireNotNull(activity).application

        binding = FragmentSearchBinding.inflate(inflater)

        coin = SearchFragmentArgs.fromBundle(requireArguments()).selectedCoin

        viewModelFactory = SearchCoinViewModelFactory(coin, application)

        viewModel = ViewModelProvider(
            this, viewModelFactory
        ).get(SearchCoinViewModel::class.java)

        binding.viewModel = viewModel

        binding.lifecycleOwner = this


        binding.coinList.adapter = ListGridAdapter(ListGridAdapter.OnClickListener {
            viewModel.displayCoinDetails(it)
        })


        viewModel.navigateToSelectedCoin.observe(viewLifecycleOwner, Observer {
            if (null != it) {
                this.findNavController().navigate(SearchFragmentDirections.actionShowDetail(it))
                viewModel.displayCoinDetailsComplete()
            }
        })

        return binding.root
    }


}