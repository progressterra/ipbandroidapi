package com.progressterra.ipbandroidapi.api.scrm.models.address


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class ListOfAddressesResponse(
    @SerializedName("data")
    val addressInfo: MainInfoAboutAddress,
) : BaseResponse()