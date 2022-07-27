package com.example.cryptocurrencypricesapp.market

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.leanback.widget.GuidedActionAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.databinding.FragmentCoinsListBinding


class CoinsListFragment : Fragment() {
    private lateinit var viewModel: CoinsListViewModel
    private lateinit var binding: FragmentCoinsListBinding

    @SuppressLint("FragmentLiveDataObserve")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_coins_list, container, false
        )

        viewModel = ViewModelProvider(this).get(CoinsListViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        binding.coinsList.adapter = ListGridAdapter(ListGridAdapter.OnClickListener {
            viewModel.displayCoinDetails(it)
        })

        viewModel.navigateToSelectedCoin.observe(this, Observer {
            if (null != it) {
                this.findNavController().navigate(CoinsListFragmentDirections.actionShowDetail(it))
                viewModel.displayCoinDetailsComplete()
            }
        })
        binding.homeGroup.setOnClickListener {
            findNavController().navigate(CoinsListFragmentDirections.actionCoinsListFragmentToHomeFragment())
        }
        binding.notificationGroup.setOnClickListener {
            findNavController().navigate(CoinsListFragmentDirections.actionCoinsListFragmentToNotificationsFragment())
        }
        binding.settingsGroup.setOnClickListener {
        findNavController().navigate(CoinsListFragmentDirections.actionCoinsListFragmentToSettingsFragment2())
        }
        return binding.root
    }

    /*private fun bottomNavigationManager() {

         View.OnClickListener { view ->
            when (view) {
                binding.homeGroup ->
                    findNavController().navigate(CoinsListFragmentDirections.actionCoinsListFragmentToHomeFragment())

                binding.marketGroup ->
                    findNavController().navigate(CoinsListFragmentDirections.actionCoinsListFragmentToHomeFragment())

                binding.notificationGroup ->
                    findNavController().navigate(CoinsListFragmentDirections.actionCoinsListFragmentToHomeFragment())

                binding.settingsGroup ->
                    findNavController().navigate(CoinsListFragmentDirections.actionCoinsListFragmentToHomeFragment())

                else -> {
                    Log.i("Nothing selected", "Nothing selected.")
                }

            }
        }


    }*/
}