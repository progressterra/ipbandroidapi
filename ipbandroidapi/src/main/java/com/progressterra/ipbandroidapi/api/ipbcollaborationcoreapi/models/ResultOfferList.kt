package com.progressterra.ipbandroidapi.api.ipbcollaborationcoreapi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class ResultOfferList(
    @SerializedName("dataList") val dataList: List<RGOffersExt>? = null
) : BaseResponse()

data class RGOffersExt(
    @SerializedName("idUnique") val idUnique: String? = null,
    @SerializedName("lastTimeUpdated") val lastTimeUpdated: String? = null,
    @SerializedName("idParentEnterprise") val idParentEnterprise: String? = null,
    @SerializedName("idEnterprise") val idEnterprise: String? = null,
    @SerializedName("listIDCities") val listIDCities: String? = null,
    @SerializedName("idCategory") val idCategory: String? = null,
    @SerializedName("dateStart") val dateStart: String? = null,
    @SerializedName("deadlineDate") val deadlineDate: String? = null,
    @SerializedName("imageUrl") val imageUrl: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("headDescription") val headDescription: String? = null,
    @SerializedName("fullDescription") val fullDescription: String? = null,
    @SerializedName("forOwn") val forOwn: Boolean? = null,
    @SerializedName("enrollBonuses") val enrollBonuses: Double? = null,
    @SerializedName("listIDCitiesRes") val listIDCitiesRes: List<String>? = null,
    @SerializedName("enterpriseData") val enterpriseData: RGEnterpriseData? = null
)