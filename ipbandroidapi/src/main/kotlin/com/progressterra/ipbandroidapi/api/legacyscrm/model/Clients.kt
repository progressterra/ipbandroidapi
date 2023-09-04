package com.progressterra.ipbandroidapi.api.legacyscrm.model

import com.google.gson.annotations.SerializedName

data class Clients (

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("soname")
    val soname: String? = null,

    @SerializedName("patronymic")
    val patronymic: String? = null,

    @SerializedName("sex")
    val sex: Int? = null,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String? = null,

    @SerializedName("dateOfRegister")
    val dateOfRegister: String? = null,

    @SerializedName("comment")
    val comment: String? = null
)

