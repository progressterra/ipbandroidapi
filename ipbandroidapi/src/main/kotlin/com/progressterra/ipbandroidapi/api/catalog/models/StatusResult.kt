package com.progressterra.ipbandroidapi.api.catalog.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: success,warning,errorServer,errorAuth,errorAccess
 */

enum class StatusResult {

    @SerializedName("success")
    SUCCESS,

    @SerializedName("warning")
    WARNING,

    @SerializedName("errorServer")
    ERROR_SERVER,

    @SerializedName("errorAuth")
    ERROR_AUTH,

    @SerializedName("errorAccess")
    ERROR_ACCESS
}
