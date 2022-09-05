package com.progressterra.ipbandroidapi.api.ibonus.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.BaseResult

/**
* API model
 */
data class TransactionListResponse(
    @SerializedName("result") val result: BaseResult,
    @SerializedName("data") val dataList: List<Data>,
    @SerializedName("totalNumberRecords") val totalNumberRecords: Int
) {

    data class Data(
        @SerializedName("dateEvent")
        val dateEvent: String,
        @SerializedName("quantity")
        val quantity: Double,
        @SerializedName("typeBonusName")
        val typeBonusName: String?,
        @SerializedName("typeOperation")
        val typeOperation: Int
    ) {

        fun toTransactionInfo(): TransactionInfo = TransactionInfo(
            dateEvent,
            quantity,
            typeBonusName ?: "",
            typeOperation
        )
    }
}