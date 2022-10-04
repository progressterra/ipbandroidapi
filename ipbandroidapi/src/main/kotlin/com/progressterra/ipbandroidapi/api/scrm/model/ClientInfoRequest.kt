package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

internal data class ClientInfoRequest(
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

