package com.example.cryptocurrencypricesapp.market

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.databinding.FragmentCoinsListBinding
import android.widget.SearchView.OnQueryTextListener as OnQueryTextListener1


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

        binding.searchView.isSubmitButtonEnabled = true




        binding.searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                Log.i(TAG, "onQueryTextSubmit: $query")
                if (!query.equals(null)){
                findNavController().navigate(CoinsListFragmentDirections.actionCoinsListFragmentToSearchFragment(query))}
                // task HERE
                //on submit send entire query
                return false
            }

        })
        
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