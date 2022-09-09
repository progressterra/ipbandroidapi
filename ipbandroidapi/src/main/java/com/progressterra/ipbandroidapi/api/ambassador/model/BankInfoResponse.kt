package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class BankInfoResponse(
    @SerializedName("data")
    val clientBankData: BankAccountDetailsRaw
) : BaseResponse()