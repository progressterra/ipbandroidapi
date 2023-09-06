package com.progressterra.ipbandroidapi.api.collaboration.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param lastTimeUpdated
 * @param idParentEnterprise Глобальная организация, которая является владельцем программы лояльности
 * @param idEnterprise
 * @param listIDCities Для фильтрации по регионам и городам
 * @param dateStart
 * @param deadlineDate
 * @param idPacketManage
 * @param imageUrl
 * @param name
 * @param headDescription
 * @param fullDescription
 * @param listIDCitiesRes
 * @param enterpriseData
 */


data class RGNewsExt(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("lastTimeUpdated")
    val lastTimeUpdated: String? = null,

    /* Глобальная организация, которая является владельцем программы лояльности */
    @SerializedName("idParentEnterprise")
    val idParentEnterprise: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    /* Для фильтрации по регионам и городам */
    @SerializedName("listIDCities")
    val listIDCities: String? = null,

    @SerializedName("dateStart")
    val dateStart: String? = null,

    @SerializedName("deadlineDate")
    val deadlineDate: String? = null,

    @SerializedName("idPacketManage")
    val idPacketManage: String? = null,

    @SerializedName("imageUrl")
    val imageUrl: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("headDescription")
    val headDescription: String? = null,

    @SerializedName("fullDescription")
    val fullDescription: String? = null,

    @SerializedName("listIDCitiesRes")
    val listIDCitiesRes: List<String>? = null,

    @SerializedName("enterpriseData")
    val enterpriseData: RGEnterpriseData? = null

)

