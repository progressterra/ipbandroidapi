package com.progressterra.ipbandroidapi.api.messenger.models

import com.google.gson.annotations.SerializedName

/**
 * Метаданные клиента с идентификатором используется для создания диалога и добавления клиента в диалог
 *
 * @param dataSourceType 
 * @param dataSourceName 
 * @param description 
 * @param idClient 
 */


data class MetaDataClientWithID (

    @SerializedName("dataSourceType")
    val dataSourceType: TypeDataSource? = null,

    @SerializedName("dataSourceName")
    val dataSourceName: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("idClient")
    val idClient: String? = null

)

