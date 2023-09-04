package com.progressterra.ipbandroidapi.api.auth.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param tempToken Временный токен, по которому определяем значение канала, который хотим подтвердить
 * @param secondForResendSMS 
 * @param numberAttemptsLeft 
 */


data class ResultSendCodeForClient (

    /* Временный токен, по которому определяем значение канала, который хотим подтвердить */
    @SerializedName("tempToken")
    val tempToken: String? = null,

    @SerializedName("secondForResendSMS")
    val secondForResendSMS: Int? = null,

    @SerializedName("numberAttemptsLeft")
    val numberAttemptsLeft: Int? = null

)

