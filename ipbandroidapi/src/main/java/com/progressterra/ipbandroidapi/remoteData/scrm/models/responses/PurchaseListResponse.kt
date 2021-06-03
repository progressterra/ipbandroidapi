package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.BonusesConverters
import com.progressterra.ipbandroidapi.interfaces.client.bonuses.models.Purchase
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

internal class PurchasesListResponse(
    @SerializedName("listdata")
    val listdata: List<Listdata>
) : BaseResponse() {

    fun convertToOrderList(purchasesListResponse: PurchasesListResponse?): MutableList<Purchase> {
        val convertedPurchases = mutableListOf<Purchase>()
        purchasesListResponse?.listdata?.map {
            convertedPurchases.add(
                Purchase(
                    addedBonusesSum = it.addedBonusesSum ?: 0,
                    purchaseDate = BonusesConverters.convertDate(it.purchaseDate),
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

data class Listdata(
    @SerializedName("addedBonusesSum")
    val addedBonusesSum: Int? = null,
    @SerializedName("purchaseDate")
    val purchaseDate: String? = null,
    @SerializedName("purchaseId")
    val purchaseId: String? = null,
    @SerializedName("purchaseSum")
    val purchaseSum: Int? = null,
    @SerializedName("shopName")
    val shopName: String? = null,
    @SerializedName("spentBonusesSum")
    val spentBonusesSum: Double? = null
)

