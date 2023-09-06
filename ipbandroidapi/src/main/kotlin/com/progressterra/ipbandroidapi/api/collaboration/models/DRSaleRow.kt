package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param iddrSaleForReturn
 * @param iddrRetrun
 * @param idrfNomnclatura
 * @param idrgGoodsInventory
 * @param idFeature
 * @param barcodeCodeGoods
 * @param nameGoods
 * @param basePrice
 * @param idDiscountBasisForBeginPrice
 * @param beginPrice
 * @param endPrice
 * @param priceCost
 * @param idSeller
 * @param indexInCheck
 * @param saleType
 * @param defectName
 * @param idrfReasonReturn
 * @param reasonReturnText
 * @param kiz
 * @param imageJSONData
 * @param datePickingFirst
 * @param datePickingSecond
 * @param drAddedBonus
 * @param drDiscountPosition
 * @param drPaymentPositionSale
 * @param drPaymentRowBonus
 * @param dhSaleHead
 */


data class DRSaleRow(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("iddrSaleForReturn")
    val iddrSaleForReturn: String? = null,

    @SerializedName("iddrRetrun")
    val iddrRetrun: String? = null,

    @SerializedName("idrfNomnclatura")
    val idrfNomnclatura: String? = null,

    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String? = null,

    @SerializedName("idFeature")
    val idFeature: String? = null,

    @SerializedName("barcodeCodeGoods")
    val barcodeCodeGoods: String? = null,

    @SerializedName("nameGoods")
    val nameGoods: String? = null,

    @SerializedName("basePrice")
    val basePrice: Double? = null,

    @SerializedName("idDiscountBasisForBeginPrice")
    val idDiscountBasisForBeginPrice: String? = null,

    @SerializedName("beginPrice")
    val beginPrice: Double? = null,

    @SerializedName("endPrice")
    val endPrice: Double? = null,

    @SerializedName("priceCost")
    val priceCost: Double? = null,

    @SerializedName("idSeller")
    val idSeller: String? = null,

    @SerializedName("indexInCheck")
    val indexInCheck: Int? = null,

    @SerializedName("saleType")
    val saleType: Int? = null,

    @SerializedName("defectName")
    val defectName: String? = null,

    @SerializedName("idrfReasonReturn")
    val idrfReasonReturn: String? = null,

    @SerializedName("reasonReturnText")
    val reasonReturnText: String? = null,

    @SerializedName("kiz")
    val kiz: String? = null,

    @SerializedName("imageJSONData")
    val imageJSONData: String? = null,

    @SerializedName("datePickingFirst")
    val datePickingFirst: String? = null,

    @SerializedName("datePickingSecond")
    val datePickingSecond: String? = null,

    @SerializedName("drAddedBonus")
    val drAddedBonus: List<DRAddedBonus>? = null,

    @SerializedName("drDiscountPosition")
    val drDiscountPosition: List<DRDiscountPosition>? = null,

    @SerializedName("drPaymentPositionSale")
    val drPaymentPositionSale: List<DRPaymentPositionSale>? = null,

    @SerializedName("drPaymentRowBonus")
    val drPaymentRowBonus: List<DRPaymentRowBonus>? = null,

    @SerializedName("dhSaleHead")
    val dhSaleHead: DHSaleHead? = null

)

