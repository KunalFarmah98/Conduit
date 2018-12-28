package com.apps.kunalfarmah.conduit.Data

import com.apps.kunalfarmah.conduit.Data.Models.Comments
import com.google.gson.annotations.SerializedName
import org.w3c.dom.Comment

data class ArticleResponse(@SerializedName("article")
                           val article: Article)

data class ArticleArrayResponse(
    @SerializedName("articles")
    val articles: ArrayList<Article> ,
    @SerializedName("articlesCount")
    var artticlesCount:Int

)

data class ProfileResponse(
    @SerializedName("profile")
    val profile: Profile
)

data class UserResponse(
    @SerializedName("user")
    val user: User
)

data class CommentResponse(
    @SerializedName("comment")
    val comment: Comment
)


data class CommentsResponse(
    @SerializedName("comments")
    val comments: List<Comments>?
)

