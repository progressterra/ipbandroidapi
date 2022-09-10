package com.progressterra.ipbandroidapi.api.testimonials.model

import com.google.gson.annotations.SerializedName

internal data class TestimonialRequest(
    @SerializedName("nickNameClient") val nickNameClient: String,
    @SerializedName("message") val message: String,
    @SerializedName("idEmployye") val idEmployee: String,
    @SerializedName("idOrder") val idOrder: String,
    @SerializedName("idShop") val idShop: String,
    @SerializedName("clientEstimate") val rating: Int,
    @SerializedName("typeMessage") val typeMessage: String
)