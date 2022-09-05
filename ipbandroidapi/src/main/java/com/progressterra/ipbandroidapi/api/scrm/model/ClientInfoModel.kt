package com.progressterra.ipbandroidapi.api.scrm.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class ClientInfoModel(
    @SerializedName("idUnique")
    val idUnique: String,
    @SerializedName("idEnterprise")
    val idEnterprise: String,
    @SerializedName("name")
    val name: String?,
    @SerializedName("soname")
    val soname: String?,
    @SerializedName("patronymic")
    val patronymic: String?,
    @SerializedName("sex")
    val sex: Int?,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String?,
    @SerializedName("dateOfRegister")
    val dateOfRegister: String,
    @SerializedName("comment")
    val comment: String?
) {

    fun toClientData(): ClientData = ClientData(
        idUnique,
        idEnterprise,
        name ?: "",
        soname ?: "",
        patronymic ?: "",
        sex ?: 0,
        dateOfBirth ?: "",
        dateOfRegister,
        comment ?: ""
    )
}