package com.progressterra.ipbandroidapi.api.scrm.models.address.dadata

import com.google.gson.annotations.SerializedName

class DadataSuggestionsRequest(
    @SerializedName("count")
    val count: Int = 10,
    @SerializedName("query")
    val query: String
)