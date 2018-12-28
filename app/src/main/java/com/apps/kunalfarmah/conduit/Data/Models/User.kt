package com.apps.kunalfarmah.conduit.Data

import com.google.gson.annotations.SerializedName

data class User(
                @SerializedName("image")
                val image: Any? = null,
                @SerializedName("bio")
                val bio: String = "",
                @SerializedName("email")
                val email: String = "",
                @SerializedName("token")
                val token: String = "",
                @SerializedName("username")
                val username: String = ""
)