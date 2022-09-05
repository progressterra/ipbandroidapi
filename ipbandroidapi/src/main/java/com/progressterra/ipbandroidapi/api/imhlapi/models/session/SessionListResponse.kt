package com.progressterra.ipbandroidapi.api.imhlapi.models.session


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class SessionListResponse(
    @SerializedName("dataList")
    val dataList: List<SessionExt>?
) : BaseResponse()

data class SessionExt(
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idQuantumEnd")
    val idQuantumEnd: String?,
    @SerializedName("idQuantumStart")
    val idQuantumStart: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idrfActor")
    val idrfActor: String?,
    @SerializedName("sessionType")
    val sessionType: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("titleAvatar")
    val titleAvatar: String?
)
