package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

data class RGClientDataPersonalEntity(

    @SerializedName("nickName")
    val nickName: String? = null,

    /* Краткое описание о себе */
    @SerializedName("descriptionAboutMe")
    val descriptionAboutMe: String? = null
)
