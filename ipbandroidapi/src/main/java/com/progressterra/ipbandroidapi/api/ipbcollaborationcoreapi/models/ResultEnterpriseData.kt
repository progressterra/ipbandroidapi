package com.progressterra.ipbandroidapi.api.ipbcollaborationcoreapi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ResultEnterpriseData(
    @SerializedName("data") val data: RGEnterpriseData? = null
) : BaseResponse()

data class RGEnterpriseData(
    @SerializedName("idUnique") val idUnique: String? = null,
    @SerializedName("lastTimeUpdated") val lastTimeUpdated: String? = null,
    @SerializedName("idParentEnterprise") val idParentEnterprise: String? = null,
    @SerializedName("idEnterprise") val idEnterprise: String? = null,
    @SerializedName("title") val title: String? = null,
    @SerializedName("subTitle") val subTitle: String? = null,
    @SerializedName("idCategory") val idCategory: String? = null,
    @SerializedName("listIDCities") val listIDCities: String? = null,
    @SerializedName("headImageURL") val headImageURL: String? = null,
    @SerializedName("logoImageURL") val logoImageURL: String? = null,
    @SerializedName("miniImageURL") val miniImageURL: String? = null,
    @SerializedName("fullDescription") val fullDescription: String? = null,
    @SerializedName("websiteURL") val websiteURL: String? = null,
    @SerializedName("delivery") val delivery: Boolean? = null,
    @SerializedName("enrollBonuses") val enrollBonuses: Double? = null,
    @SerializedName("acceptBonuses") val acceptBonuses: Double? = null,
    @SerializedName("galleryListImageAgileDataJSON") val galleryListImageAgileDataJSON: String? = null,
    @SerializedName("listContactsJSON") val listContactsJSON: String? = null
)