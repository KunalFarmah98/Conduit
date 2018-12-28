package com.apps.kunalfarmah.conduit.Data

import retrofit2.Call
import retrofit2.http.GET

interface ConduitApiInterface {

    @GET("articles")

    fun getArticles(): Call<ArticleArrayResponse>
}