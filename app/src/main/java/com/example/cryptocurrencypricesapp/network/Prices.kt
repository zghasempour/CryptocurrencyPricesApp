package com.example.cryptocurrencypricesapp.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Prices(
    val prices: MutableList<MutableList<Float>> = mutableListOf()
): Parcelable
