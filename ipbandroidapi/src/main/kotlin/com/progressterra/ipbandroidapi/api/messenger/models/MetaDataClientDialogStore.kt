package com.progressterra.ipbandroidapi.api.messenger.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param dataSourceType 
 * @param dataSourceName 
 * @param description 
 * @param listImages 
 */


data class MetaDataClientDialogStore (

    @SerializedName("dataSourceType")
    val dataSourceType: TypeDataSource? = null,

    @SerializedName("dataSourceName")
    val dataSourceName: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("listImages")
    val listImages: List<RGEntitytMediaDataViewModel>? = null

)

