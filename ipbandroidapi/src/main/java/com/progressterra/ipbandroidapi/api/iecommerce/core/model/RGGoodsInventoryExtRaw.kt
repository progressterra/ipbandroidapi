package com.progressterra.ipbandroidapi.api.iecommerce.core.model

import com.google.gson.annotations.SerializedName

internal data class RGGoodsInventoryExtRaw(
    @SerializedName("idUnique") val idUnique: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("extendedDescription") val extendedDescription: String?,
    @SerializedName("artikul") val artikul: String?,
    @SerializedName("idEnterprise") val idEnterprise: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("imageDataJSON") val imageDataJSON: String?,
    @SerializedName("additionalDataJSON") val additionalDataJSON: String?,
    @SerializedName("idCategory") val idCategory: String?,
    @SerializedName("popularOrder") val popularOrder: Int?,
    @SerializedName("rating") val rating: Float?,
    @SerializedName("barcode") val barcode: String?,
    @SerializedName("idDiscountBasisForBeginPrice") val idDiscountBasisForBeginPrice: String?,
    @SerializedName("idFeature") val idFeature: String?,
    @SerializedName("nameFeature") val nameFeature: String?,
    @SerializedName("defectName") val defectName: String?,
    @SerializedName("kiz") val kiz: String?,
    @SerializedName("additionaInfo") val additionaInfo: String?,
    @SerializedName("lastTimeUpdate") val lastTimeUpdate: String?,
    @SerializedName("idrfNomenclatura") val idrfNomenclatura: String?,
    @SerializedName("idrfShop") val idrfShop: String?,
    @SerializedName("quantity") val quantity: Int?,
    @SerializedName("beginPrice") val beginPrice: Double?,
    @SerializedName("currentPrice") val currentPrice: Double?,
    @SerializedName("costPrice") val costPrice: Double?,
    @SerializedName("costtPriceBasicUnit") val costtPriceBasicUnit: Double?,
    @SerializedName("maxValueDiscount") val maxValueDiscount: Double?,
    @SerializedName("idrfPlace") val idrfPlace: String?,
    @SerializedName("colorName") val colorName: String?,
    @SerializedName("idrfColor") val idrfColor: String?,
    @SerializedName("countInCart") val countInCart: Int?
)