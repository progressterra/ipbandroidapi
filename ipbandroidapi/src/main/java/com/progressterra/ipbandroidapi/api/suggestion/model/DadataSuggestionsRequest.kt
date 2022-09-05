package com.progressterra.ipbandroidapi.api.suggestion.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
class DadataSuggestionsRequest(
    @SerializedName("count")
    val count: Int = 10,
    @SerializedName("query")
    val query: String
)