package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName

data class UpdateUserInfoRequest(
    @SerializedName("soname")
    val soname: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("patronymic")
    val patronymic: String,
    @SerializedName("sex")
    val sex: Int
)
