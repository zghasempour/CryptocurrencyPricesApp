package com.example.cryptocurrencypricesapp.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Coin(
    val id : String,
    val name : String,
    val current_price : Double,
    val image : String) : Parcelable
