package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class TransactionListResponse(
    @SerializedName("dataList")
    val dataList: List<Data>,

    ) : BaseResponse() {
    data class Data(
        @SerializedName("dateEvent")
        val dateEvent: String? = null,
        @SerializedName("quantity")
        val quantity: Double? = null,
        @SerializedName("typeBonusName")
        val typeBonusName: String? = null,
        @SerializedName("typeOperation")
        val typeOperation: Int? = null
    )
}