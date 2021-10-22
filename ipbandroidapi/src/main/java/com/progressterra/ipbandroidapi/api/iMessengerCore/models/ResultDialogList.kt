package com.progressterra.ipbandroidapi.api.iMessengerCore.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ResultDialogList(
    @SerializedName("dataList") val dataList: List<DialogInfo>? = null
) : BaseResponse()