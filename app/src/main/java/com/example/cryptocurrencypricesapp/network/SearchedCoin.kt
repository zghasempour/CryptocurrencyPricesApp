package com.example.cryptocurrencypricesapp.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchedCoin(
    val id : String,
    val name : String,
    val market_cap_rank : Int,
    val thumb : String) : Parcelable
