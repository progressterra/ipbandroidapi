package com.progressterra.ipbandroidapi.api.scrm.models.requests


import com.google.gson.annotations.SerializedName

data class ClientInfoRequest(
    @SerializedName("sex")
    val sex: Int,
    @SerializedName("soname")
    val soname: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("patronymic")
    val patronymic: String?,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String,
    @SerializedName("comment")
    val comment: String?
)

