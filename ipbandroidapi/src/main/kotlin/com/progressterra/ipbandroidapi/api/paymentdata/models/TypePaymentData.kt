package com.progressterra.ipbandroidapi.api.paymentdata.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: bankcardData,bankCardAccount
 */

enum class TypePaymentData {

    @SerializedName("bankcardData")
    BANK_CARD_DATA,

    @SerializedName("bankCardAccount")
    BANK_CARD_ACCOUNT
}
