package com.example.cryptocurrencypricesapp.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.databinding.FragmentHomeBinding
import com.example.cryptocurrencypricesapp.databinding.FragmentSettingsBinding
import com.example.cryptocurrencypricesapp.market.CoinsListFragmentDirections


class SettingsFragment : Fragment() {

    private lateinit var binding: FragmentSettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_settings, container, false)
        binding.homeGroup.setOnClickListener {
            findNavController().navigate(SettingsFragmentDirections.actionSettingsFragment2ToHomeFragment())
        }
        binding.marketGroup.setOnClickListener {
            findNavController().navigate(SettingsFragmentDirections.actionSettingsFragment2ToCoinsListFragment())
        }
        binding.notificationGroup.setOnClickListener {
            findNavController().navigate(SettingsFragmentDirections.actionSettingsFragment2ToNotificationsFragment())
        }

        return binding.root
    }

}