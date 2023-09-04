package com.progressterra.ipbandroidapi.api.auth.models


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * Values: SUCCESS,WARNING,ERROR_SERVER,ERROR_AUTH,ERROR_ACCESS
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

