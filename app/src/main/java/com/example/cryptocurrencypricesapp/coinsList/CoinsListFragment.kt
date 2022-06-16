package com.example.cryptocurrencypricesapp.coinsList

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.databinding.FragmentCoinsListBinding


class CoinsListFragment : Fragment() {
    private lateinit var viewModel : CoinsListViewModel
    private lateinit var binding : FragmentCoinsListBinding

    @SuppressLint("FragmentLiveDataObserve")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_coins_list
            , container, false)

        viewModel = ViewModelProvider(this).get(CoinsListViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        binding.coinsList.adapter = ListGridAdapter(ListGridAdapter.OnClickListener{
            viewModel.displayCoinDetails(it)
        })

        viewModel.navigateToSelectedCoin.observe(this, Observer {
            if ( null != it ) {
                this.findNavController().navigate(CoinsListFragmentDirections.actionShowDetail(it))
                viewModel.displayCoinDetailsComplete()
            }
        })

        return binding.root
    }


}