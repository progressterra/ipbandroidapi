package com.progressterra.ipbandroidapi.api.address.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class ListOfAddressesResponse(
    @SerializedName("data")
    val addressInfo: AddressesRaw,
) : BaseResponse()