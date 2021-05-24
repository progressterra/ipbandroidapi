package com.progressterra.ipbandroidapi.repository.models.access_token


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.repository.models.base.BaseResponse

class AccessTokenResponse(
    @SerializedName("accessToken")
    val accessToken: String? = null,
) : BaseResponse()

