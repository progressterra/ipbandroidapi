package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.BonusesConverters
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.Transaction
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal data class TransactionListResponse(
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

    fun convertToTransactionList(transactionListResponse: TransactionListResponse?): MutableList<Transaction> {
        val convertedTransactions = mutableListOf<Transaction>()

        transactionListResponse?.dataList?.map {
            convertedTransactions.add(
                Transaction(
                    dateEvent = BonusesConverters.convertDate(it.dateEvent),
                    quantity = it.quantity?.toInt() ?: 0,
                    typeBonusName = it.typeBonusName ?: "",
                    typeOperation = it.typeOperation ?: 0
                )
            )
        }
        return convertedTransactions
    }
}