package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.Data
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.ShopListResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.TransactionListResponse
import com.progressterra.ipbandroidapi.utils.extentions.parseToDate
import java.text.SimpleDateFormat
import java.util.*


internal object BonusesConverters {

    // ковертируем дату в нужный нам формат для отображения
    private fun convertDate(dateString: String?): String {
        if (dateString == null) {
            return ""
        }
        val date = dateString.parseToDate()
        val sdf = SimpleDateFormat("dd.MM", Locale.getDefault())
        return sdf.format(date)
    }

    fun convertToBonusesInfo(data: Data?) =
        BonusesInfo(
            currentQuantity = data?.currentQuantity?.toInt() ?: 0,
            dateBurning = convertDate(data?.dateBurning),
            forBurningQuantity = data?.forBurningQuantity?.toInt() ?: 0,
            typeBonusName = data?.typeBonusName ?: ""
        )

    fun convertToTransactionList(transactionListResponse: TransactionListResponse?): MutableList<Transaction> {
        val convertedTransactions = mutableListOf<Transaction>()

        transactionListResponse?.dataList?.map {
            convertedTransactions.add(
                Transaction(
                    dateEvent = convertDate(it.dateEvent),
                    quantity = it.quantity?.toInt() ?: 0,
                    typeBonusName = it.typeBonusName ?: "",
                    typeOperation = it.typeOperation ?: 0
                )
            )
        }
        return convertedTransactions
    }

    fun convertToOrderList(shopListResponse: ShopListResponse?): MutableList<Purchase> {
        val convertedPurchases = mutableListOf<Purchase>()
        shopListResponse?.listdata?.map {
            convertedPurchases.add(
                Purchase(
                    addedBonusesSum = it.addedBonusesSum ?: 0,
                    purchaseDate = convertDate(it.purchaseDate),
                    purchaseId = it.purchaseId ?: "",
                    purchaseSum = it.purchaseSum ?: 0,
                    shopName = it.shopName ?: "",
                    spentBonusesSum = it.spentBonusesSum?.toInt() ?: 0
                )
            )
        }
        return convertedPurchases

    }
}
