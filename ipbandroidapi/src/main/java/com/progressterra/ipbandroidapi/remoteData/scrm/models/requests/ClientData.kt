package com.progressterra.ipbandroidapi.remoteData.scrm.models.requests

import com.google.gson.annotations.SerializedName

data class ClientData(
    @SerializedName("DateOfBirth")
    val dateOfBirth: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Patronymic")
    val patronymic: Any?,
    @SerializedName("Sex")
    val sex: String,
    @SerializedName("Soname")
    val soname: String
)
