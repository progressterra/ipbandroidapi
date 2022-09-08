package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class AmbassadorStatusResponse(
    @SerializedName("data")
    val ambassadorInfo: Data,
) : BaseResponse() {

    data class Data(
        @SerializedName("dataAmbassador")
        val dataAmbassador: AmbassadorStatusRaw?,
        @SerializedName("message")
        val message: String?,
        @SerializedName("statusText")
        val statusText: String?,
        @SerializedName("statusWork")
        val statusWork: Int?
    )
}