package com.progressterra.ipbandroidapi.api.ipbambassador.models.direct_payment

import com.google.gson.annotations.SerializedName

data class SetNewPhoneRequest(
    @SerializedName("accessToken")
    var accessToken: String,
    @SerializedName("phone")
    var phone: String,
    @SerializedName("verifiedChannelCode")
    var verifiedChannelCode: String
)