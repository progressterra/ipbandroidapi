package com.progressterra.ipbandroidapi.remoteData.scrm.models.upload_file

import com.google.gson.annotations.SerializedName

class UploadActRequest(
    @SerializedName("iddh")
    var iddh: String,
    @SerializedName("urlImageAct")
    var urlImageAct: String
)