package com.apps.kunalfarmah.conduit.Data

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ConduitClient {

    // we need an hhtpclient to parse json calls
val okHttpClient = OkHttpClient.Builder()
    .connectTimeout(2,TimeUnit.MINUTES)
    .build()
// creating a retrofit object and addong a gson convertor to it acc to the documentation
    val retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl("https://conduit.productionready.io/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // creating a conduit api object and adding the api interface to it
    val conduitApi = retrofit.create(ConduitApiInterface::class.java)

}