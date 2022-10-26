package com.progressterra.ipbandroidapi.user

import com.google.gson.annotations.SerializedName

data class UserName(

    @SerializedName("name")
    val name: String = "",

    @SerializedName("surname")
    val surname: String = "",

    @SerializedName("patronymic")
    val patronymic: String = ""
)
