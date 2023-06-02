package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * Values: asString,asNumber,asDateTime,asReference,asCustomASJSON
 */

enum class TypeValueCharacteristic {

    @SerializedName("asString")
    AS_STRING,

    @SerializedName("asNumber")
    AS_NUMBER,

    @SerializedName("asDateTime")
    AS_DATE_TIME,

    @SerializedName("asReference")
    AS_REFERENCE,

    @SerializedName("asCustomASJSON")
    AS_CUSTOM_AS_JSON
}
