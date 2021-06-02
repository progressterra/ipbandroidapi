package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.BonusMessage
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.BonusesInfo
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.Purchase
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.Transaction
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.BonusesMessagesResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.GeneralInfoResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.PurchasesListResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.TransactionListResponse
import com.progressterra.ipbandroidapi.utils.extentions.parseToDate
import java.text.SimpleDateFormat
import java.util.*


internal object BonusesConverters {

    // ковертируем дату в нужный нам формат для отображения
    fun convertDate(dateString: String?): String {
        if (dateString == null) {
            return ""
        }
        val date = dateString.parseToDate()
        val sdf = SimpleDateFormat("dd.MM", Locale.getDefault())
        return sdf.format(date)
    }

    fun convertToBonusesInfo(generalInfoResponse: GeneralInfoResponse?): BonusesInfo {
        return if (generalInfoResponse?.data != null) {
            BonusesInfo(
                currentQuantity = generalInfoResponse.data.currentQuantity?.toInt() ?: 0,
                dateBurning = convertDate(generalInfoResponse.data.dateBurning),
                forBurningQuantity = generalInfoResponse.data.forBurningQuantity?.toInt() ?: 0,
                typeBonusName = generalInfoResponse.data.typeBonusName ?: ""
            )
        } else {
            BonusesInfo(0, "", 0, "")
        }

    }

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

    fun convertToOrderList(purchasesListResponse: PurchasesListResponse?): MutableList<Purchase> {
        val convertedPurchases = mutableListOf<Purchase>()
        purchasesListResponse?.listdata?.map {
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

    fun convertToBonusMessagesList(bonusMessagesResponse: BonusesMessagesResponse?): MutableList<BonusMessage> {
        val convertedBonusMessages = mutableListOf<BonusMessage>()
        bonusMessagesResponse?.dataList?.map {
            convertedBonusMessages.add(
                BonusMessage(
                    currentQuantity = it.currentQuantity?.toInt() ?: 0,
                    dateBurning = convertDate(it.dateBurning),
                    forBurningQuantity = it.forBurningQuantity?.toInt() ?: 0,
                    typeBonusName = it.typeBonusName ?: ""
                )
            )
        }
        return convertedBonusMessages
    }
}
