package com.progressterra.ipbandroidapi.api.scrm.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param name 
 * @param soname 
 * @param patronymic 
 * @param sex 
 * @param dateOfBirth 
 * @param dateOfRegister 
 * @param comment 
 */


data class ClientsEntity (

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("soname")
    val soname: String? = null,

    @SerializedName("patronymic")
    val patronymic: String? = null,

    @SerializedName("sex")
    val sex: TypeSex? = null,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String? = null,

    @SerializedName("dateOfRegister")
    val dateOfRegister: String? = null,

    @SerializedName("comment")
    val comment: String? = null

)

