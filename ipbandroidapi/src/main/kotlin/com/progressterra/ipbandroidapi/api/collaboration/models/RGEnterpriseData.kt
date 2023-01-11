package com.progressterra.ipbandroidapi.api.collaboration.models


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param lastTimeUpdated
 * @param idParentEnterprise Глобальная организация, которая является владельцем программы лояльности
 * @param idEnterprise
 * @param title
 * @param subTitle
 * @param idCategory
 * @param listIDCities Для фильтрации по регионам и городам
 * @param headImageURL
 * @param logoImageURL
 * @param miniImageURL
 * @param fullDescription
 * @param websiteURL
 * @param delivery
 * @param enrollBonuses
 * @param acceptBonuses
 * @param galleryListImageAgileDataJSON
 * @param listContactsJSON
 */


data class RGEnterpriseData(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("lastTimeUpdated")
    val lastTimeUpdated: String? = null,

    /* Глобальная организация, которая является владельцем программы лояльности */
    @SerializedName("idParentEnterprise")
    val idParentEnterprise: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("subTitle")
    val subTitle: String? = null,

    @SerializedName("idCategory")
    val idCategory: String? = null,

    /* Для фильтрации по регионам и городам */
    @SerializedName("listIDCities")
    val listIDCities: String? = null,

    @SerializedName("headImageURL")
    val headImageURL: String? = null,

    @SerializedName("logoImageURL")
    val logoImageURL: String? = null,

    @SerializedName("miniImageURL")
    val miniImageURL: String? = null,

    @SerializedName("fullDescription")
    val fullDescription: String? = null,

    @SerializedName("websiteURL")
    val websiteURL: String? = null,

    @SerializedName("delivery")
    val delivery: Boolean? = null,

    @SerializedName("enrollBonuses")
    val enrollBonuses: Double? = null,

    @SerializedName("acceptBonuses")
    val acceptBonuses: Double? = null,

    @SerializedName("galleryListImageAgileDataJSON")
    val galleryListImageAgileDataJSON: String? = null,

    @SerializedName("listContactsJSON")
    val listContactsJSON: String? = null

)

