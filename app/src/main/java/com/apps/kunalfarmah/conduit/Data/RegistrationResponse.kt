package com.apps.kunalfarmah.conduit.Data

import com.google.gson.annotations.SerializedName

data class RegistrationResponse(@SerializedName("userInfo")
                                val userInfo: UserInfo)