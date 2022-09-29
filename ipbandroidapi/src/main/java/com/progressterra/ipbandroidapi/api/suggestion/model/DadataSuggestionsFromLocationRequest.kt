package com.progressterra.ipbandroidapi.api.suggestion.model

import com.google.gson.annotations.SerializedName

internal class DadataSuggestionsFromLocationRequest(
    @SerializedName("lat") val latitude: Float, @SerializedName("lon") val longitude: Float
)