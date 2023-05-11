package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param nomenclature
 * @param inventoryData
 * @param listProductCharacteristic Список характеристик товара
 * @param installmentPlanValue
 * @param countInCart
 */
data class ProductView(

    @SerializedName("nomenclature") val nomenclature: RFNomenclatureViewModel? = null,

    @SerializedName("inventoryData") val inventoryData: RGGoodsInventoryViewModel? = null,

    /* Список характеристик товара */
    @SerializedName("listProductCharacteristic") val listProductCharacteristic: List<CharacteristicData>? = null,

    @SerializedName("installmentPlanValue") val installmentPlanValue: InstallmentPlan? = null,

    @SerializedName("countInCart") val countInCart: Int? = null
)
