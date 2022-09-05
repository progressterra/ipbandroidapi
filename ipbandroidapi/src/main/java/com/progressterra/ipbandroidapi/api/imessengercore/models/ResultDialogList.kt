package com.progressterra.ipbandroidapi.api.imessengercore.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ResultDialogList(
    @SerializedName("dataList") val dataList: List<DialogInfo>? = null
) : BaseResponse()