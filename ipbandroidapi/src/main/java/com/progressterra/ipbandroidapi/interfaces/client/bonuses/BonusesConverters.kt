package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import com.progressterra.ipbandroidapi.api.ibonus.model.BonusesMessagesResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.GeneralInfoResponse
import com.progressterra.ipbandroidapi.api.ibonus.model.TransactionListResponse
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.*
import com.progressterra.ipbandroidapi.api.scrm.models.responses.PurchasesListResponse
import com.progressterra.ipbandroidapi.utils.extentions.orNow
import com.progressterra.ipbandroidapi.utils.extentions.parseToDate
import com.progressterra.ipbandroidapi.utils.extentions.tryOrNull
import java.text.SimpleDateFormat
import java.util.*


internal object BonusesConverters {

    fun convertDate(dateString: String?): String {
        if (dateString == null)
            return ""
        val date = dateString.parseToDate()
        val sdf = SimpleDateFormat("dd.MM", Locale.getDefault())
        return sdf.format(date!!)
    }

    fun convertToBonusesInfo(generalInfoResponse: GeneralInfoResponse?): BonusesInfo {
        return if (generalInfoResponse?.data != null) {
            BonusesInfo(
                currentQuantity = generalInfoResponse.data.currentQuantity.toInt(),
                dateBurning = convertDate(generalInfoResponse.data.dateBurning),
                forBurningQuantity = generalInfoResponse.data.forBurningQuantity.toInt(),
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
                    quantity = it.quantity.toInt(),
                    typeBonusName = it.typeBonusName ?: "",
                    typeOperation = it.typeOperation
                )
            )
        }
        return convertedTransactions
    }

    fun convertToTransactionRaw(transactionListResponse: TransactionListResponse?): List<TransactionRaw> {
        val convertedTransactions = mutableListOf<TransactionRaw>()

        transactionListResponse?.dataList?.map {
            convertedTransactions.add(
                TransactionRaw(
                    dateEvent = tryOrNull { it.dateEvent.parseToDate() }.orNow(),
                    quantity = it.quantity.toInt(),
                    typeBonusName = it.typeBonusName ?: "",
                    typeOperation = it.typeOperation
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
                    currentQuantity = it.currentQuantity.toInt(),
                    dateBurning = convertDate(it.dateBurning),
                    forBurningQuantity = it.forBurningQuantity.toInt(),
                    typeBonusName = it.typeBonusName ?: ""
                )
            )
        }
        return convertedBonusMessages
    }
}