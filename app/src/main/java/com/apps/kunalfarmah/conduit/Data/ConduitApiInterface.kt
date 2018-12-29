package com.apps.kunalfarmah.conduit.Data

import retrofit2.Call
import retrofit2.http.GET

interface ConduitApiInterface {

    @GET("articles")
    fun getArticles(): Call<ArticleArrayResponse>

    @GET("articles/:slug")
    fun getArticle(): Call<ArticleResponse>

    @GET("articles/:slug/comments")
    fun getComments() : Call<CommentsResponse>

    @GET("comment")
    fun getComment() : Call<CommentResponse>

    @GET("profiles/:username")
    fun getProfile() : Call<ProfileResponse>

    @GET("user")
    fun getUser(): Call<UserResponse>

    @GET("tags")
    fun getTags(): Call<TagsArrayResponse>

}