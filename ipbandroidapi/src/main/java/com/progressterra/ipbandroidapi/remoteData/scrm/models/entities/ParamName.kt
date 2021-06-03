package com.progressterra.ipbandroidapi.remoteData.scrm.models.entities

internal enum class ParamName(
    val value: String
) {
    EMAIL("email"),
    PHONE("phone"),
    ADD_DEVICE("adddevice"),
    ADD_PHONE("addphone"),
    ID_DEVICE("iddevice"),
    CREATE_NEW_CLIENT("createnewclient")
}