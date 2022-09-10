package com.progressterra.ipbandroidapi.api.ipbmediadata.model

data class MediaData(
    val alias: String = "",
    val contentType: Int = 0,
    val dataJSON: String = "",
    val dateEvent: String = "",
    val idUnique: String = "",
    val order: Int = 0,
    val previewText: String = "",
    val size: Int = 0,
    val stringData: String = "",
    val tag: Int = 0,
    val urlData: String = ""
) {

    internal constructor(data: MediaRaw) : this(
        data.alias ?: "",
        data.contentType ?: 0,
        data.dataJSON ?: "",
        data.dateEvent ?: "",
        data.idUnique ?: "",
        data.order ?: 0,
        data.previewText ?: "",
        data.size ?: 0,
        data.stringData ?: "",
        data.tag ?: 0,
        data.urlData ?: ""
    )
}