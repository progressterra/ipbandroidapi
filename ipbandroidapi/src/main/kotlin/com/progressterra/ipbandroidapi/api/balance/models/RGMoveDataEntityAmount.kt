package com.progressterra.ipbandroidapi.api.balance.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idrfRegister 
 * @param dimension1 Измерение 1
 * @param dimension2 
 * @param dimension3 
 * @param dimension4 
 * @param dimension5 
 * @param amount Сумма движения
 */


data class RGMoveDataEntityAmount (

    @SerializedName("idrfRegister")
    val idrfRegister: String? = null,

    /* Измерение 1 */
    @SerializedName("dimension1")
    val dimension1: String? = null,

    @SerializedName("dimension2")
    val dimension2: String? = null,

    @SerializedName("dimension3")
    val dimension3: String? = null,

    @SerializedName("dimension4")
    val dimension4: String? = null,

    @SerializedName("dimension5")
    val dimension5: String? = null,

    /* Сумма движения */
    @SerializedName("amount")
    val amount: Double? = null

)

