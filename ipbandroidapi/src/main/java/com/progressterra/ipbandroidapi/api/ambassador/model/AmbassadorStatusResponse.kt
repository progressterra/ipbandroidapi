package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class AmbassadorStatusResponse(
    @SerializedName("data")
    val ambassadorInfo: Data,
) : BaseResponse() {

    data class Data(
        @SerializedName("dataAmbassador")
        val dataAmbassador: AmbassadorDetailsRaw?,
        @SerializedName("message")
        val message: String?,
        @SerializedName("statusText")
        val statusText: String?,
        @SerializedName("statusWork")
        val statusWork: Int?
    )
}