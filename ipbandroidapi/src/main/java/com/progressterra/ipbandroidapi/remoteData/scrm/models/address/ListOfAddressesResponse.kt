package com.progressterra.ipbandroidapi.remoteData.scrm.models.address


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class ListOfAddressesResponse(
    @SerializedName("data")
    val addressInfo: MainInfoAboutAddress,
) : BaseResponse()