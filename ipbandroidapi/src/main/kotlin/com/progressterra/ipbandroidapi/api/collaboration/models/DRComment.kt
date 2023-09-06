package com.progressterra.ipbandroidapi.api.collaboration.models


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param dateComment
 * @param idUser
 * @param userString
 * @param comment
 * @param messageForClient
 */


data class DRComment(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("dateComment")
    val dateComment: String? = null,

    @SerializedName("idUser")
    val idUser: String? = null,

    @SerializedName("userString")
    val userString: String? = null,

    @SerializedName("comment")
    val comment: String? = null,

    @SerializedName("messageForClient")
    val messageForClient: String? = null

)

