package com.progressterra.ipbandroidapi.api.checklist.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: OFFLINE,APP,WEB,STORE
 */

enum class TypeComPlace {

    @SerializedName("offline")
    OFFLINE,

    @SerializedName("app")
    APP,

    @SerializedName("web")
    WEB,

    @SerializedName("store")
    STORE;
}

