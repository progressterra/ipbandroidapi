package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class DrSaleRow(
    @SerializedName("barcodeCodeGoods")
    val barcodeCodeGoods: String?,
    @SerializedName("basePrice")
    val basePrice: Int?,
    @SerializedName("beginPrice")
    val beginPrice: Double?,
    @SerializedName("datePickingFirst")
    val datePickingFirst: String?,
    @SerializedName("datePickingSecond")
    val datePickingSecond: String?,
    @SerializedName("defectName")
    val defectName: String?,
    @SerializedName("dhSaleHead")
    val dhSaleHead: DhSaleHead?,
    @SerializedName("drAddedBonus")
    val drAddedBonus: List<DrAddedBonus>?,
    @SerializedName("drDiscountPosition")
    val drDiscountPosition: List<DrDiscountPosition>?,
    @SerializedName("drPaymentPositionSale")
    val drPaymentPositionSale: List<DrPaymentPositionSale>?,
    @SerializedName("drPaymentRowBonus")
    val drPaymentRowBonus: List<DrPaymentRowBonus>?,
    @SerializedName("endPrice")
    val endPrice: Double?,
    @SerializedName("idDiscountBasisForBeginPrice")
    val idDiscountBasisForBeginPrice: String?,
    @SerializedName("idFeature")
    val idFeature: String?,
    @SerializedName("idSeller")
    val idSeller: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String?,
    @SerializedName("iddrRetrun")
    val iddrRetrun: String?,
    @SerializedName("iddrSaleForReturn")
    val iddrSaleForReturn: String?,
    @SerializedName("idrfNomnclatura")
    val idrfNomnclatura: String?,
    @SerializedName("idrfReasonReturn")
    val idrfReasonReturn: String?,
    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String?,
    @SerializedName("imageJSONData")
    val imageJSONData: String?,
    @SerializedName("indexInCheck")
    val indexInCheck: Int?,
    @SerializedName("kiz")
    val kiz: String?,
    @SerializedName("nameGoods")
    val nameGoods: String?,
    @SerializedName("priceCost")
    val priceCost: Int?,
    @SerializedName("reasonReturnText")
    val reasonReturnText: String?,
    @SerializedName("saleType")
    val saleType: Int?
)