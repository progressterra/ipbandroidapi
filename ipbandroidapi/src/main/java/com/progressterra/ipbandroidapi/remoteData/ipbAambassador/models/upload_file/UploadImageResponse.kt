package com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.upload_file


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class UploadImageResponse(
    @SerializedName("data")
    val uploadImageData: UploadImageData? = null,
) : BaseResponse()

data class UploadImageData(
    @SerializedName("alias")
    val alias: String? = null,
    @SerializedName("contentType")
    val contentType: Int? = null,
    @SerializedName("dataJSON")
    val dataJSON: String? = null,
    @SerializedName("dateEvent")
    val dateEvent: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("order")
    val order: Int? = null,
    @SerializedName("previewText")
    val previewText: String? = null,
    @SerializedName("size")
    val size: Int? = null,
    @SerializedName("stringData")
    val stringData: String? = null,
    @SerializedName("tag")
    val tag: Int? = null,
    @SerializedName("urlData")
    val urlData: String? = null
)