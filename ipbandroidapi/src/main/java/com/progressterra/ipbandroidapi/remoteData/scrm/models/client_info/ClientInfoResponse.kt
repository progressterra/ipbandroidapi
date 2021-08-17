package com.progressterra.ipbandroidapi.remoteData.scrm.models.client_info


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ClientInfoResponse(
    @SerializedName("client")
    val client: Client,
    @SerializedName("clientAdditionalInfo")
    val clientAdditionalInfo: ClientAdditionalInfo,
    @SerializedName("status")
    val clientStatus: Int
) : BaseResponse()

data class Client(
    @SerializedName("comment")
    val comment: String?,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String?,
    @SerializedName("dateOfRegister")
    val dateOfRegister: String,
    @SerializedName("idEnterprise")
    val idEnterprise: String,
    @SerializedName("idUnique")
    val idUnique: String,
    @SerializedName("name")
    val name: String?,
    @SerializedName("patronymic")
    val patronymic: String?,
    @SerializedName("sex")
    val sex: Int?,
    @SerializedName("soname")
    val soname: String?
)

data class ClientAdditionalInfo(
    @SerializedName("additionalInfo")
    val additionalInfo: String?,
    @SerializedName("eMailGeneral")
    val eMailGeneral: String,
    @SerializedName("phoneGeneral")
    val phoneGeneral: String,
    @SerializedName("statusCompletion")
    val statusCompletion: Int
)

