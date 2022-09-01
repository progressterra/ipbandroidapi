package com.progressterra.ipbandroidapi.api.ibonus.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.api.scrm.models.BaseResult
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.BonusesConverters
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.Transaction

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
    )

    fun convertToTransactionList(transactionListResponse: TransactionListResponse?): List<Transaction> {
        return buildList {
            transactionListResponse?.dataList?.map {
                add(
                    Transaction(
                        dateEvent = BonusesConverters.convertDate(it.dateEvent),
                        quantity = it.quantity.toInt(),
                        typeBonusName = it.typeBonusName ?: "",
                        typeOperation = it.typeOperation
                    )
                )
            }
        }
    }
}