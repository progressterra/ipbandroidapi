package com.progressterra.ipbandroidapi.api.checklist.model

import java.time.LocalDateTime

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
    val idUnique: String?,
    val idEnterprise: String?,
    val name: String?,
    val address: String?,
    val dateOpen: LocalDateTime?,
    val dateClose: LocalDateTime?,
    val idCtiy: String?,
    val contacts: String?,
    val latitude: Double?,
    val longitude: Double?,
    val imageURL: String?,
    val shopType: TypeShop?,
    val countAvailableRFCheck: Int?,
    val countDHCheckPerformedForExecution: Int?
)