package com.progressterra.ipbandroidapi.api.imessenger.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ResultDialogList(
    @SerializedName("dataList") val dataList: List<DialogInfoRaw>? = null
) : BaseResponse()