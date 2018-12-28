package com.apps.kunalfarmah.conduit.Data.Models

import com.google.gson.annotations.SerializedName

data class Comments(@SerializedName("createdAt")
                        val createdAt: String = "",
                    @SerializedName("author")
                        val author: Author,
                    @SerializedName("id")
                        val id: Int = 0,
                    @SerializedName("body")
                        val body: String = "",
                    @SerializedName("updatedAt")
                        val updatedAt: String = "")