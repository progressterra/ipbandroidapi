package com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.upload_file

import com.google.gson.annotations.SerializedName

class UploadContractOfAmbassadorRequest(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("urlImage")
    val urlImage: String
)
