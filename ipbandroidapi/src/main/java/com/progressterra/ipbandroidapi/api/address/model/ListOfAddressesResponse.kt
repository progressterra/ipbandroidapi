package com.progressterra.ipbandroidapi.api.address.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

/**
* API model
 */
data class ListOfAddressesResponse(
    @SerializedName("data")
    val addressInfo: MainInfoAboutAddress,
) : BaseResponse()