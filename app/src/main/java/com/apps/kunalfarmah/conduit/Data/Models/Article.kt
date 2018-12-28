package com.apps.kunalfarmah.conduit.Data

import com.apps.kunalfarmah.conduit.Data.Models.Author
import com.google.gson.annotations.SerializedName

data class Article(@SerializedName("tagList")
                   val tagList: List<String>?,
                   @SerializedName("createdAt")
                   val createdAt: String = "",
                   @SerializedName("author")
                   val author: Author,
                   @SerializedName("description")
                   val description: String = "",
                   @SerializedName("title")
                   val title: String = "",
                   @SerializedName("body")
                   val body: String = "",
                   @SerializedName("favoritesCount")
                   val favoritesCount: Int = 0,
                   @SerializedName("slug")
                   val slug: String = "",
                   @SerializedName("updatedAt")
                   val updatedAt: String = "",
                   @SerializedName("favorited")
                   val favorited: Boolean = false)