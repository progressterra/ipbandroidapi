package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class AmbassadorDataResponse(
    @SerializedName("data")
    val data: Data?
) : BaseResponse() {

    data class Data(
        @SerializedName("dataAmbassador")
        val dataAmbassador: AmbassadorDataRaw?
    )
}

