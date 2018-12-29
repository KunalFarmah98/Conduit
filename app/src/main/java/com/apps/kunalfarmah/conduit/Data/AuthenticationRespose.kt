package com.apps.kunalfarmah.conduit.Data

import com.google.gson.annotations.SerializedName

data class AuthenticationRespose(@SerializedName("userInfo")
                                 val userInfo: UserInfo)