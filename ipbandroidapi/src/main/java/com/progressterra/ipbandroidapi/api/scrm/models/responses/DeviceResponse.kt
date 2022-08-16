package com.progressterra.ipbandroidapi.api.scrm.models.responses

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

internal data class DeviceResponse(
    @SerializedName("idDevice")
    val idDevice: String? = null
) : BaseResponse()