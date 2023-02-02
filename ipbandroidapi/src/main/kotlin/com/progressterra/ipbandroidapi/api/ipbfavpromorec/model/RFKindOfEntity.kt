package com.progressterra.ipbandroidapi.api.ipbfavpromorec.model

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idUnique 
 * @param idEnterprise 
 * @param entitiesType 
 * @param description 
 * @param title Что может отображаться в заголовке
 * @param idEntity Дополнительное разграничение, например, по каталогу, если блоки отображаются на экране независимо. Может означать экран, на котором отображается блок
 * @param order Порядок отображения блоков
 * @param jsonData 
 * @param dateStartShow 
 * @param deadlineDateShow 
 * @param dataForDefaultLinkTo Данные для перехода по умолчанию. Например, может быть идентификатором каталога.
 * @param titleDataForDefaultLinkTo Заголовок, который может сопровождать кнопку перехода по умолчанию
 */


data class RFKindOfEntity (

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("entitiesType")
    val entitiesType: TypeEntities? = null,

    @SerializedName("description")
    val description: String? = null,

    /* Что может отображаться в заголовке */
    @SerializedName("title")
    val title: String? = null,

    /* Дополнительное разграничение, например, по каталогу, если блоки отображаются на экране независимо. Может означать экран, на котором отображается блок */
    @SerializedName("idEntity")
    val idEntity: String? = null,

    /* Порядок отображения блоков */
    @SerializedName("order")
    val order: Int? = null,

    @SerializedName("jsonData")
    val jsonData: String? = null,

    @SerializedName("dateStartShow")
    val dateStartShow: String? = null,

    @SerializedName("deadlineDateShow")
    val deadlineDateShow: String? = null,

    /* Данные для перехода по умолчанию. Например, может быть идентификатором каталога. */
    @SerializedName("dataForDefaultLinkTo")
    val dataForDefaultLinkTo: String? = null,

    /* Заголовок, который может сопровождать кнопку перехода по умолчанию */
    @SerializedName("titleDataForDefaultLinkTo")
    val titleDataForDefaultLinkTo: String? = null

)

