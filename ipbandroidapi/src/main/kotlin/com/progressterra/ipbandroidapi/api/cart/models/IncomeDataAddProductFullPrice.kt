package com.progressterra.ipbandroidapi.api.cart.models


import com.google.gson.annotations.SerializedName

/**
 * Данные об номенклатуре и количетсве
 *
 * @param idrfNomenclature 
 * @param count 
 */


data class IncomeDataAddProductFullPrice (

    @SerializedName("idrfNomenclature")
    val idrfNomenclature: String? = null,

    @SerializedName("count")
    val count: Int? = null

)

