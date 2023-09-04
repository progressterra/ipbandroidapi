package com.progressterra.ipbandroidapi.api.legacyscrm.model

import com.google.gson.annotations.SerializedName

data class ClientDataIncome (

    @SerializedName("sex")
    val sex: Long? = null,

    @SerializedName("soname")
    val soname: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("patronymic")
    val patronymic: String? = null,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String? = null,

    @SerializedName("comment")
    val comment: String? = null
)

