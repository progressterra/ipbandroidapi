package com.progressterra.ipbandroidapi.api.product.models


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param name
 * @param extendedDescription
 * @param artikul
 * @param idEnterprise
 * @param url
 * @param imageDataJSON
 * @param additionalDataJSON
 * @param idCategory
 * @param popularOrder
 * @param rating
 * @param barcode
 * @param idDiscountBasisForBeginPrice
 * @param idFeature
 * @param nameFeature
 * @param defectName
 * @param kiz
 * @param additionaInfo
 * @param lastTimeUpdate
 * @param idrfNomenclatura
 * @param idrfShop
 * @param quantity
 * @param beginPrice
 * @param currentPrice
 * @param costPrice
 * @param costtPriceBasicUnit
 * @param maxValueDiscount
 * @param idrfPlace
 * @param colorName
 * @param idrfColor
 * @param countInCart
 */

data class RGGoodsInventoryExt(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("extendedDescription")
    val extendedDescription: String? = null,

    @SerializedName("artikul")
    val artikul: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("imageDataJSON")
    val imageDataJSON: String? = null,

    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null,

    @SerializedName("idCategory")
    val idCategory: String? = null,

    @SerializedName("popularOrder")
    val popularOrder: Int? = null,

    @SerializedName("rating")
    val rating: Float? = null,

    @SerializedName("barcode")
    val barcode: String? = null,

    @SerializedName("idDiscountBasisForBeginPrice")
    val idDiscountBasisForBeginPrice: String? = null,

    @SerializedName("idFeature")
    val idFeature: String? = null,

    @SerializedName("nameFeature")
    val nameFeature: String? = null,

    @SerializedName("defectName")
    val defectName: String? = null,

    @SerializedName("kiz")
    val kiz: String? = null,

    @SerializedName("additionaInfo")
    val additionaInfo: String? = null,

    @SerializedName("lastTimeUpdate")
    val lastTimeUpdate: String? = null,

    @SerializedName("idrfNomenclatura")
    val idrfNomenclatura: String? = null,

    @SerializedName("idrfShop")
    val idrfShop: String? = null,

    @SerializedName("quantity")
    val quantity: Int? = null,

    @SerializedName("beginPrice")
    val beginPrice: Double? = null,

    @SerializedName("currentPrice")
    val currentPrice: Double? = null,

    @SerializedName("costPrice")
    val costPrice: Double? = null,

    @SerializedName("costtPriceBasicUnit")
    val costtPriceBasicUnit: Double? = null,

    @SerializedName("maxValueDiscount")
    val maxValueDiscount: Double? = null,

    @SerializedName("idrfPlace")
    val idrfPlace: String? = null,

    @SerializedName("colorName")
    val colorName: String? = null,

    @SerializedName("idrfColor")
    val idrfColor: String? = null,

    @SerializedName("countInCart")
    val countInCart: Int? = null

)

