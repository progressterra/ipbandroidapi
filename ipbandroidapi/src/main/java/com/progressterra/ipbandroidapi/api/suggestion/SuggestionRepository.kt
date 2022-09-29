package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.SuggestionData

internal interface SuggestionRepository {

    suspend fun getSuggestionsAddressFromLocation(
        latitude: Float, longitude: Float
    ): Result<List<SuggestionData>>

    suspend fun getSuggestionsAddressFromDadata(keyword: String): Result<List<SuggestionData>>
}