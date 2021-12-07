package com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData

data class DeviceParameters(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("idDivice") val idDevice: String = UserData.deviceId,
    @SerializedName("idClient") val idClient: String = UserData.clientInfo.idUnique,
    @SerializedName("deviceToken") val deviceToken: String
)
