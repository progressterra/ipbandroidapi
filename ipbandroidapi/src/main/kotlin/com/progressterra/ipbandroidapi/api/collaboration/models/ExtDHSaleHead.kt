package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param idEnterprise
 * @param idExternalERP
 * @param dateDoc
 * @param number
 * @param numberInt
 * @param fDocumentNumber
 * @param adressString
 * @param idExtDataAddress
 * @param commentClient
 * @param posted
 * @param idPreSale
 * @param currentPositionInCashCahnge
 * @param typeSaleReturn
 * @param idrfShop
 * @param idrgCashChange
 * @param idrfCashier
 * @param idBayer
 * @param beginTimeService
 * @param endTimeService
 * @param mode
 * @param statusOrder
 * @param statusObject
 * @param postedAddBonuses
 * @param postedWritingBonuses
 * @param dateSync
 * @param dateSyncWithExternalERP
 * @param indexCount
 * @param fiscalCheckNumber
 * @param dateToSend
 * @param dateConfirm
 * @param dateCollection
 * @param dateTranssferToSend
 * @param dateStartProcessingDelivery
 * @param dateCustomerReceived
 * @param dateClose
 * @param levelOfSatisfaction
 * @param reasonLevelOfSatisfaction
 * @param systemLevelOfSatisfaction
 * @param idEmployyeOrderPicker
 * @param idEmployyeCourier
 * @param fiscalCheckFN
 * @param fiscalCheckFD
 * @param fiscalCheckFP
 * @param drDiscountSaleHead
 * @param drGiftCardPayment
 * @param drPaymentSaleHead
 * @param drSaleRow
 * @param drMetaDHSaleHead
 * @param drComment
 * @param adAvailablePaymentBonus
 */


data class ExtDHSaleHead(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("idExternalERP")
    val idExternalERP: String? = null,

    @SerializedName("dateDoc")
    val dateDoc: String? = null,

    @SerializedName("number")
    val number: String? = null,

    @SerializedName("numberInt")
    val numberInt: Int? = null,

    @SerializedName("fDocumentNumber")
    val fDocumentNumber: Int? = null,

    @SerializedName("adressString")
    val adressString: String? = null,

    @SerializedName("idExtDataAddress")
    val idExtDataAddress: String? = null,

    @SerializedName("commentClient")
    val commentClient: String? = null,

    @SerializedName("posted")
    val posted: String? = null,

    @SerializedName("idPreSale")
    val idPreSale: String? = null,

    @SerializedName("currentPositionInCashCahnge")
    val currentPositionInCashCahnge: Long? = null,

    @SerializedName("typeSaleReturn")
    val typeSaleReturn: TypeSaleReturn? = null,

    @SerializedName("idrfShop")
    val idrfShop: String? = null,

    @SerializedName("idrgCashChange")
    val idrgCashChange: String? = null,

    @SerializedName("idrfCashier")
    val idrfCashier: String? = null,

    @SerializedName("idBayer")
    val idBayer: String? = null,

    @SerializedName("beginTimeService")
    val beginTimeService: String? = null,

    @SerializedName("endTimeService")
    val endTimeService: String? = null,

    @SerializedName("mode")
    val mode: Int? = null,

    @SerializedName("statusOrder")
    val statusOrder: TypeStatusOrder? = null,

    @SerializedName("statusObject")
    val statusObject: Int? = null,

    @SerializedName("postedAddBonuses")
    val postedAddBonuses: String? = null,

    @SerializedName("postedWritingBonuses")
    val postedWritingBonuses: String? = null,

    @SerializedName("dateSync")
    val dateSync: String? = null,

    @SerializedName("dateSyncWithExternalERP")
    val dateSyncWithExternalERP: String? = null,

    @SerializedName("indexCount")
    val indexCount: Int? = null,

    @SerializedName("fiscalCheckNumber")
    val fiscalCheckNumber: Int? = null,

    @SerializedName("dateToSend")
    val dateToSend: String? = null,

    @SerializedName("dateConfirm")
    val dateConfirm: String? = null,

    @SerializedName("dateCollection")
    val dateCollection: String? = null,

    @SerializedName("dateTranssferToSend")
    val dateTranssferToSend: String? = null,

    @SerializedName("dateStartProcessingDelivery")
    val dateStartProcessingDelivery: String? = null,

    @SerializedName("dateCustomerReceived")
    val dateCustomerReceived: String? = null,

    @SerializedName("dateClose")
    val dateClose: String? = null,

    @SerializedName("levelOfSatisfaction")
    val levelOfSatisfaction: TypeLevelOfSatisfaction? = null,

    @SerializedName("reasonLevelOfSatisfaction")
    val reasonLevelOfSatisfaction: String? = null,

    @SerializedName("systemLevelOfSatisfaction")
    val systemLevelOfSatisfaction: TypeLevelOfSatisfaction? = null,

    @SerializedName("idEmployyeOrderPicker")
    val idEmployyeOrderPicker: String? = null,

    @SerializedName("idEmployyeCourier")
    val idEmployyeCourier: String? = null,

    @SerializedName("fiscalCheckFN")
    val fiscalCheckFN: String? = null,

    @SerializedName("fiscalCheckFD")
    val fiscalCheckFD: String? = null,

    @SerializedName("fiscalCheckFP")
    val fiscalCheckFP: String? = null,

    @SerializedName("drDiscountSaleHead")
    val drDiscountSaleHead: List<DRDiscountSaleHead>? = null,

    @SerializedName("drGiftCardPayment")
    val drGiftCardPayment: List<DRGiftCardPayment>? = null,

    @SerializedName("drPaymentSaleHead")
    val drPaymentSaleHead: List<DRPaymentSaleHead>? = null,

    @SerializedName("drSaleRow")
    val drSaleRow: List<DRSaleRow>? = null,

    @SerializedName("drMetaDHSaleHead")
    val drMetaDHSaleHead: List<DRMetaDHSaleHead>? = null,

    @SerializedName("drComment")
    val drComment: List<DRComment>? = null,

    @SerializedName("adAvailablePaymentBonus")
    val adAvailablePaymentBonus: Double? = null

)

