package com.progressterra.ipbandroidapi.api.imessenger.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class DialogInfoResponse(
    @SerializedName("data")
    val dialogInfo: DialogInfoRaw
) : BaseResponse()