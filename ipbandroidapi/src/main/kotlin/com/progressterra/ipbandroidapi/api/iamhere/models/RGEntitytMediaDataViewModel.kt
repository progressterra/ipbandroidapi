package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idEntity 
 * @param entityTypeName 
 * @param privateForClientID 
 * @param urlData 
 * @param stringData 
 * @param dataJSON 
 * @param alias 
 * @param previewText 
 * @param order 
 * @param tag 
 * @param contentType 
 * @param propertySize 
 * @param idUnique 
 * @param idEnterprise 
 * @param dateAdded 
 * @param dateUpdated 
 * @param dateSoftRemoved 
 * @param listInfoImage 
 */


data class RGEntitytMediaDataViewModel (

    @SerializedName("idEntity")
    val idEntity: String? = null,

    @SerializedName("entityTypeName")
    val entityTypeName: String? = null,

    @SerializedName("privateForClientID")
    val privateForClientID: String? = null,

    @SerializedName("urlData")
    val urlData: String? = null,

    @SerializedName("stringData")
    val stringData: String? = null,

    @SerializedName("dataJSON")
    val dataJSON: String? = null,

    @SerializedName("alias")
    val alias: String? = null,

    @SerializedName("previewText")
    val previewText: String? = null,

    @SerializedName("order")
    val order: Int? = null,

    @SerializedName("tag")
    val tag: Int? = null,

    @SerializedName("contentType")
    val contentType: TypeContent? = null,

    @SerializedName("size")
    val propertySize: Long? = null,

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("dateAdded")
    val dateAdded: String? = null,

    @SerializedName("dateUpdated")
    val dateUpdated: String? = null,

    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String? = null,

    @SerializedName("listInfoImage")
    val listInfoImage: ListInfoImage? = null

)

