package com.progressterra.ipbandroidapi.api.messenger.models


import com.google.gson.annotations.SerializedName

/**
 * Тип клиента диалога
 *
 * Values: CUSTOM,ENTERPRISE,CLIENT,ORDER,DOCSET,IWANTIT
 */

enum class TypeDataSource {

    @SerializedName("custom")
    CUSTOM,

    @SerializedName("enterprise")
    ENTERPRISE,

    @SerializedName("client")
    CLIENT,

    @SerializedName("order")
    ORDER,

    @SerializedName("docset")
    DOCSET,

    @SerializedName("iwantit")
    IWANTIT
}

