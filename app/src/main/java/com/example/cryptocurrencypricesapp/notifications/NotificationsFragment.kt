package com.example.cryptocurrencypricesapp.notifications

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.databinding.FragmentHomeBinding
import com.example.cryptocurrencypricesapp.databinding.FragmentNotificationsBinding
import com.example.cryptocurrencypricesapp.market.CoinsListFragmentDirections


class NotificationsFragment : Fragment() {

    private lateinit var binding: FragmentNotificationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_notifications, container, false
        )
        binding.homeGroup.setOnClickListener {
            findNavController().navigate(NotificationsFragmentDirections.actionNotificationsFragmentToHomeFragment())
        }
        binding.marketGroup.setOnClickListener {
            findNavController().navigate(NotificationsFragmentDirections.actionNotificationsFragmentToCoinsListFragment())
        }

        binding.settingsGroup.setOnClickListener {
            findNavController().navigate(NotificationsFragmentDirections.actionNotificationsFragmentToSettingsFragment2())
        }

        return binding.root

    }
}