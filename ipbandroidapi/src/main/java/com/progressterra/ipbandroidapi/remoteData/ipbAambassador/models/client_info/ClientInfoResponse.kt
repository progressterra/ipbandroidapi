package com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ClientInfoResponse(
    @SerializedName("client")
    val client: Client? = null,
    @SerializedName("clientAdditionalInfo")
    val clientAdditionalInfo: ClientAdditionalInfo? = null,
    @SerializedName("status")
    val clientStatus: Int? = null
) : BaseResponse()

data class Client(
    @SerializedName("comment")
    val comment: String? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String? = null,
    @SerializedName("dateOfRegister")
    val dateOfRegister: String? = null,
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("patronymic")
    val patronymic: String? = null,
    @SerializedName("sex")
    val sex: Int? = null,
    @SerializedName("soname")
    val soname: String? = null
)

data class ClientAdditionalInfo(
    @SerializedName("additionalInfo")
    val additionalInfo: String? = null,
    @SerializedName("eMailGeneral")
    val eMailGeneral: String? = null,
    @SerializedName("phoneGeneral")
    val phoneGeneral: String? = null,
    @SerializedName("statusCompletion")
    val statusCompletion: Int? = null
)

