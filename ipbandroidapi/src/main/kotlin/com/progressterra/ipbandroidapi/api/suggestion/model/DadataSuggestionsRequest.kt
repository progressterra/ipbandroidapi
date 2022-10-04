package com.progressterra.ipbandroidapi.api.suggestion.model

import com.google.gson.annotations.SerializedName

internal class DadataSuggestionsRequest(
    @SerializedName("query") val query: String, @SerializedName("count") val count: Int
)