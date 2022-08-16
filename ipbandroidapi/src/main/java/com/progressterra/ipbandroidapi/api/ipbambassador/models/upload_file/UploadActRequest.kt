package com.progressterra.ipbandroidapi.api.ipbambassador.models.upload_file

import com.google.gson.annotations.SerializedName

class UploadActRequest(
    @SerializedName("iddh")
    var iddh: String,
    @SerializedName("urlImageAct")
    var urlImageAct: String
)