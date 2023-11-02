package com.progressterra.ipbandroidapi.api.iamhere.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param nickName Никнейм, который пользователь устанавливает
 * @param descriptionAboutMe Краткое описание о себе
 */


data class RGClientDataPersonalEntity (

    /* Никнейм, который пользователь устанавливает */
    @SerializedName("nickName")
    val nickName: String? = null,

    /* Краткое описание о себе */
    @SerializedName("descriptionAboutMe")
    val descriptionAboutMe: String? = null

)

