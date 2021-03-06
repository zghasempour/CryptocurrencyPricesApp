package com.example.cryptocurrencypricesapp.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.tradingview.lightweightcharts.api.series.common.SeriesData
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://api.coingecko.com/api/v3/coins/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
   .addConverterFactory(MoshiConverterFactory.create(moshi))
   // .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BASE_URL)
    .build()
interface MarketsApiService {
    @GET("markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false")
    fun getMarketsList() : Call<List<Coin>>

    @GET("bitcoin/market_chart?vs_currency=usd&days=2")
    fun getMarketsHistoryList() : Call<Prices>
}

object MarketsApi {
    val retrofitService : MarketsApiService by lazy {
        retrofit.create(MarketsApiService::class.java)
    }
}