package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.cart


import com.google.gson.annotations.SerializedName

data class DrSaleRow(
    @SerializedName("barcodeCodeGoods")
    val barcodeCodeGoods: String? = null,
    @SerializedName("basePrice")
    val basePrice: Int? = null,
    @SerializedName("beginPrice")
    val beginPrice: Double? = null,
    @SerializedName("datePickingFirst")
    val datePickingFirst: String? = null,
    @SerializedName("datePickingSecond")
    val datePickingSecond: String? = null,
    @SerializedName("defectName")
    val defectName: String? = null,
    @SerializedName("dhSaleHead")
    val dhSaleHead: DhSaleHead? = null,
    @SerializedName("drAddedBonus")
    val drAddedBonus: List<DrAddedBonus>? = null,
    @SerializedName("drDiscountPosition")
    val drDiscountPosition: List<DrDiscountPosition>? = null,
    @SerializedName("drPaymentPositionSale")
    val drPaymentPositionSale: List<DrPaymentPositionSale>? = null,
    @SerializedName("drPaymentRowBonus")
    val drPaymentRowBonus: List<DrPaymentRowBonus>? = null,
    @SerializedName("endPrice")
    val endPrice: Double? = null,
    @SerializedName("idDiscountBasisForBeginPrice")
    val idDiscountBasisForBeginPrice: String? = null,
    @SerializedName("idFeature")
    val idFeature: String? = null,
    @SerializedName("idSeller")
    val idSeller: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,
    @SerializedName("iddrRetrun")
    val iddrRetrun: String? = null,
    @SerializedName("iddrSaleForReturn")
    val iddrSaleForReturn: String? = null,
    @SerializedName("idrfNomnclatura")
    val idrfNomnclatura: String? = null,
    @SerializedName("idrfReasonReturn")
    val idrfReasonReturn: String? = null,
    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String? = null,
    @SerializedName("imageJSONData")
    val imageJSONData: String? = null,
    @SerializedName("indexInCheck")
    val indexInCheck: Int? = null,
    @SerializedName("kiz")
    val kiz: String? = null,
    @SerializedName("nameGoods")
    val nameGoods: String? = null,
    @SerializedName("priceCost")
    val priceCost: Int? = null,
    @SerializedName("reasonReturnText")
    val reasonReturnText: String? = null,
    @SerializedName("saleType")
    val saleType: Int? = null
)