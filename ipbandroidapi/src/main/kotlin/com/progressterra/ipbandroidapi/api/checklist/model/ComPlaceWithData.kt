package com.progressterra.ipbandroidapi.api.checklist.model

import com.google.gson.annotations.SerializedName

/**
 *
 * @param idUnique
 * @param idEnterprise
 * @param name
 * @param address
 * @param dateOpen
 * @param dateClose
 * @param idCtiy
 * @param contacts
 * @param latitude
 * @param longitude
 * @param imageURL
 * @param shopType
 * @param countAvailableRFCheck Количество доступных для данного места чек листов
 * @param countDHCheckPerformedForExecution Количество документов к выполнению
 */
data class ComPlaceWithData(
    @SerializedName("idUnique") val idUnique: String?,
    @SerializedName("idEnterprise") val idEnterprise: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("address") val address: String?,
    @SerializedName("dateOpen") val dateOpen: String?,
    @SerializedName("dateClose") val dateClose: String?,
    @SerializedName("idCtiy") val idCtiy: String?,
    @SerializedName("contacts") val contacts: String?,
    @SerializedName("latitude") val latitude: Double?,
    @SerializedName("longitude") val longitude: Double?,
    @SerializedName("imageURL") val imageURL: String?,
    @SerializedName("shopType") val shopType: TypeShop?,
    @SerializedName("countAvailableRFCheck") val countAvailableRFCheck: Int?,
    @SerializedName("countDHCheckPerformedForExecution") val countDHCheckPerformedForExecution: Int?
)