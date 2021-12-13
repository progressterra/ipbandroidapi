package com.progressterra.ipbandroidapi.api.iECommersCoreApi.models.cart


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

/**
 * 	ExtDHSaleHead
 */
data class ProductsInBasketResponse(
    @SerializedName("data")
    val basketInfo: BasketData? = null,
) : BaseResponse()

data class BasketData(
    @SerializedName("adAvailablePaymentBonus")
    val adAvailablePaymentBonus: Int? = null,
    @SerializedName("adressString")
    val adressString: String? = null,
    @SerializedName("beginTimeService")
    val beginTimeService: String? = null,
    @SerializedName("commentClient")
    val commentClient: String? = null,
    @SerializedName("currentPositionInCashCahnge")
    val currentPositionInCashCahnge: Int? = null,
    @SerializedName("dateClose")
    val dateClose: String? = null,
    @SerializedName("dateCollection")
    val dateCollection: String? = null,
    @SerializedName("dateConfirm")
    val dateConfirm: String? = null,
    @SerializedName("dateCustomerReceived")
    val dateCustomerReceived: String? = null,
    @SerializedName("dateDoc")
    val dateDoc: String? = null,
    @SerializedName("dateStartProcessingDelivery")
    val dateStartProcessingDelivery: String? = null,
    @SerializedName("dateSync")
    val dateSync: String? = null,
    @SerializedName("dateSyncWithExternalERP")
    val dateSyncWithExternalERP: String? = null,
    @SerializedName("dateToSend")
    val dateToSend: String? = null,
    @SerializedName("dateTranssferToSend")
    val dateTranssferToSend: String? = null,
    @SerializedName("drSaleRow")
    val drSaleRow: List<DrSaleRow>? = null,
    @SerializedName("endTimeService")
    val endTimeService: String? = null,
    @SerializedName("fDocumentNumber")
    val fDocumentNumber: Int? = null,
    @SerializedName("fiscalCheckFD")
    val fiscalCheckFD: String? = null,
    @SerializedName("fiscalCheckFN")
    val fiscalCheckFN: String? = null,
    @SerializedName("fiscalCheckFP")
    val fiscalCheckFP: String? = null,
    @SerializedName("fiscalCheckNumber")
    val fiscalCheckNumber: Int? = null,
    @SerializedName("idBayer")
    val idBayer: String? = null,
    @SerializedName("idEmployyeCourier")
    val idEmployyeCourier: String? = null,
    @SerializedName("idEmployyeOrderPicker")
    val idEmployyeOrderPicker: String? = null,
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,
    @SerializedName("idExtDataAddress")
    val idExtDataAddress: String? = null,
    @SerializedName("idExternalERP")
    val idExternalERP: String? = null,
    @SerializedName("idPreSale")
    val idPreSale: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("idrfCashier")
    val idrfCashier: String? = null,
    @SerializedName("idrfShop")
    val idrfShop: String? = null,
    @SerializedName("idrgCashChange")
    val idrgCashChange: String? = null,
    @SerializedName("indexCount")
    val indexCount: Int? = null,
    @SerializedName("levelOfSatisfaction")
    val levelOfSatisfaction: Int? = null,
    @SerializedName("mode")
    val mode: Int? = null,
    @SerializedName("number")
    val number: String? = null,
    @SerializedName("posted")
    val posted: String? = null,
    @SerializedName("postedAddBonuses")
    val postedAddBonuses: String? = null,
    @SerializedName("postedWritingBonuses")
    val postedWritingBonuses: String? = null,
    @SerializedName("reasonLevelOfSatisfaction")
    val reasonLevelOfSatisfaction: String? = null,
    @SerializedName("statusObject")
    val statusObject: Int? = null,
    @SerializedName("statusOrder")
    val statusOrder: StatusOrder? = null,
    @SerializedName("systemLevelOfSatisfaction")
    val systemLevelOfSatisfaction: Int? = null,
    @SerializedName("typeSaleReturn")
    val typeSaleReturn: Int? = null
)