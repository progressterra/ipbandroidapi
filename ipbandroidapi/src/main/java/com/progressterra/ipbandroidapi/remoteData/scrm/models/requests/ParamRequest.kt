package com.progressterra.ipbandroidapi.remoteData.scrm.models.requests

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.entities.ParamName

internal open class ParamRequest(
    /**
     * Идентификатор клиента
     */
    @SerializedName("IDClient")
    var idClient: String?,
    /**
     * Токен доступа
     */
    @SerializedName("AccessToken")
    var accessToken: String,
    /**
     * Имя параметра
     */
    @SerializedName("ParamName")
    var paramName: ParamName?,
    /**
     * Значение параметра
     */
    @SerializedName("ParamValue")
    var paramValue: String?,
    /**
     * Широта
     */
    @SerializedName("Latitude")
    var latitude: Double? = 0.0,
    /**
     * Долгота
     */
    @SerializedName("Longitude")
    var longitude: Double? = 0.0
) {
    /**
     * Что-то, всегда 0
     */
    @SerializedName(("SourceQuery"))
    var sourceQuery: Int = 0
}