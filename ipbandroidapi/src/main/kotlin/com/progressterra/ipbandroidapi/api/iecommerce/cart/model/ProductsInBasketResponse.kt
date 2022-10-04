package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class ProductsInBasketResponse(
    @SerializedName("data")
    val basketInfo: Data?,
) : BaseResponse() {

    data class Data(
        @SerializedName("adAvailablePaymentBonus")
        val adAvailablePaymentBonus: Int?,
        @SerializedName("adressString")
        val adressString: String?,
        @SerializedName("beginTimeService")
        val beginTimeService: String?,
        @SerializedName("commentClient")
        val commentClient: String?,
        @SerializedName("currentPositionInCashCahnge")
        val currentPositionInCashCahnge: Int?,
        @SerializedName("dateClose")
        val dateClose: String?,
        @SerializedName("dateCollection")
        val dateCollection: String?,
        @SerializedName("dateConfirm")
        val dateConfirm: String?,
        @SerializedName("dateCustomerReceived")
        val dateCustomerReceived: String?,
        @SerializedName("dateDoc")
        val dateDoc: String?,
        @SerializedName("dateStartProcessingDelivery")
        val dateStartProcessingDelivery: String?,
        @SerializedName("dateSync")
        val dateSync: String?,
        @SerializedName("dateSyncWithExternalERP")
        val dateSyncWithExternalERP: String?,
        @SerializedName("dateToSend")
        val dateToSend: String?,
        @SerializedName("dateTranssferToSend")
        val dateTranssferToSend: String?,
        @SerializedName("drSaleRow")
        val drSaleRow: List<DrSaleRow>?,
        @SerializedName("endTimeService")
        val endTimeService: String?,
        @SerializedName("fDocumentNumber")
        val fDocumentNumber: Int?,
        @SerializedName("fiscalCheckFD")
        val fiscalCheckFD: String?,
        @SerializedName("fiscalCheckFN")
        val fiscalCheckFN: String?,
        @SerializedName("fiscalCheckFP")
        val fiscalCheckFP: String?,
        @SerializedName("fiscalCheckNumber")
        val fiscalCheckNumber: Int?,
        @SerializedName("idBayer")
        val idBayer: String?,
        @SerializedName("idEmployyeCourier")
        val idEmployyeCourier: String?,
        @SerializedName("idEmployyeOrderPicker")
        val idEmployyeOrderPicker: String?,
        @SerializedName("idEnterprise")
        val idEnterprise: String?,
        @SerializedName("idExtDataAddress")
        val idExtDataAddress: String?,
        @SerializedName("idExternalERP")
        val idExternalERP: String?,
        @SerializedName("idPreSale")
        val idPreSale: String?,
        @SerializedName("idUnique")
        val idUnique: String?,
        @SerializedName("idrfCashier")
        val idrfCashier: String?,
        @SerializedName("idrfShop")
        val idrfShop: String?,
        @SerializedName("idrgCashChange")
        val idrgCashChange: String?,
        @SerializedName("indexCount")
        val indexCount: Int?,
        @SerializedName("levelOfSatisfaction")
        val levelOfSatisfaction: Int?,
        @SerializedName("mode")
        val mode: Int?,
        @SerializedName("number")
        val number: String?,
        @SerializedName("posted")
        val posted: String?,
        @SerializedName("postedAddBonuses")
        val postedAddBonuses: String?,
        @SerializedName("postedWritingBonuses")
        val postedWritingBonuses: String?,
        @SerializedName("reasonLevelOfSatisfaction")
        val reasonLevelOfSatisfaction: String?,
        @SerializedName("statusObject")
        val statusObject: Int?,
        @SerializedName("statusOrder")
        val statusOrder: StatusOrder?,
        @SerializedName("systemLevelOfSatisfaction")
        val systemLevelOfSatisfaction: Int?,
        @SerializedName("typeSaleReturn")
        val typeSaleReturn: Int?
    )
}