package com.progressterra.ipbandroidapi.api.complace.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: offline,app,web,store
 */
enum class TypeComPlace{

    @SerializedName("offline")
    OFFLINE,

    @SerializedName("app")
    APP,

    @SerializedName("web")
    WEB,

    @SerializedName("store")
    STORE
}
