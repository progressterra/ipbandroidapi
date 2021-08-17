package com.progressterra.ipbandroidapi.remoteData.scrm.models.client_info

import com.google.gson.annotations.SerializedName

class UpdateUserInfoRequest(
    @SerializedName("soname")
    var soname: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("patronymic")
    var patronymic: String,
)
