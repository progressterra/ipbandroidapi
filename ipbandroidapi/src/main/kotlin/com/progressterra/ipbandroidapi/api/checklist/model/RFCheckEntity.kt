package com.progressterra.ipbandroidapi.api.checklist.model

/**
 * Непосредственно сам чек-лист/тест
 * @param language
 * @param name
 * @param description
 * @param urlImage
 * @param urlVideo
 */
data class RFCheckEntity(

    val language: String?,
    val name: String?,
    val description: String?,
    val urlImage: String?,
    val urlVideo: String?
)