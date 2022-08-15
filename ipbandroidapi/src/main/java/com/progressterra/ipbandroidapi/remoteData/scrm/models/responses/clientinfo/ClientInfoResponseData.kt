package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.clientinfo

import com.google.gson.annotations.SerializedName

data class ClientInfoResponseData(
    @SerializedName("client") val clientInfo: ClientInfoModel,
    @SerializedName("clientAdditionalInfo") val clientAdditionalInfo: ClientAdditionalInfoModel
)