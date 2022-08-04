package com.example.cryptocurrencypricesapp.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.*

private const val BASE_URL = "https://api.coingecko.com/api/v3/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
   .addConverterFactory(MoshiConverterFactory.create(moshi))
   // .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BASE_URL)
    .build()

interface MarketsApiService {
    @GET("coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false")
    fun getMarketsList() : Call<List<Coin>>

    @GET("coins/{coinId}/market_chart")
    fun getMarketsHistoryList(@Path("coinId") coinId: String , @Query("vs_currency") currency: String, @Query("days") days: Int) : Call<Prices>

    @GET("search")
    fun findCoin(@Query("query") query: String ) : Call<Coins>



}

object MarketsApi {
    val retrofitService : MarketsApiService by lazy {
        retrofit.create(MarketsApiService::class.java)
    }
}