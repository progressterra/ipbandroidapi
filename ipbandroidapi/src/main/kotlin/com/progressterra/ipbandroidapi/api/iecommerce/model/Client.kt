package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param idEnterprise
 * @param name
 * @param soname
 * @param patronymic
 * @param comment
 */
data class Client(

    @SerializedName("idUnique") val idUnique: String? = null,

    @SerializedName("idEnterprise") val idEnterprise: String? = null,

    @SerializedName("name") val name: String? = null,

    @SerializedName("soname") val soname: String? = null,

    @SerializedName("patronymic") val patronymic: String? = null,

    @SerializedName("comment") val comment: String? = null

)

