package com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.upload_file

import com.google.gson.annotations.SerializedName

class UploadActRequest(
    @SerializedName("iddh")
    var iddh: String,
    @SerializedName("urlImageAct")
    var urlImageAct: String
)