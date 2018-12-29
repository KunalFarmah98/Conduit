package com.apps.kunalfarmah.conduit.Data

import com.google.gson.annotations.SerializedName

data class UserInfo(@SerializedName("password")
                val password: String = "",
                    @SerializedName("email")
                val email: String = "",
                    @SerializedName("username")
                val username: String = "")