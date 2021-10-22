package com.progressterra.ipbandroidapi.api.ipbCollaborationCoreApi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ResultListShop(
    @SerializedName("dataList") val dataList: List<RFShop>? = null
) : BaseResponse()

data class RFShop(
    @SerializedName("idUnique") val idUnique: String? = null,
    @SerializedName("idEnterprise") val idEnterprise: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("address") val address: String? = null,
    @SerializedName("dateOpen") val dateOpen: String? = null,
    @SerializedName("dateClose") val dateClose: String? = null,
    @SerializedName("idCtiy") val idCtiy: String? = null,
    @SerializedName("contacts") val contacts: String? = null,
    @SerializedName("latitude") val latitude: Double? = null,
    @SerializedName("longitude") val longitude: Double? = null,
    @SerializedName("imageURL") val imageURL: String? = null,
    @SerializedName("shopType") val shopType: Int? = null
)