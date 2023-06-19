package com.progressterra.ipbandroidapi.api.cart.models


import com.google.gson.annotations.SerializedName

/**
 * Тип докумнента: 0 - Sale (Продажа), 1 - Return (Возврат)
 *
 * Values: sale,returnSale,correct,marketiing
 */

enum class TypeSaleReturn {

    @SerializedName("sale")
    SALE,

    @SerializedName("returnSale")
    RETURN_SALE,

    @SerializedName("correct")
    CORRECT,

    @SerializedName("marketiing")
    MARKETIING
}
