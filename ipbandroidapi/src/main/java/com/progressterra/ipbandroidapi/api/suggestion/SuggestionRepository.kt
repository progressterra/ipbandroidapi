package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.SuggestionData

interface SuggestionRepository {

    suspend fun getSuggestionsAddressFromLocation(
        latitude: Float, longitude: Float
    ): Result<List<SuggestionData>>

    suspend fun getSuggestionsAddressFromDadata(keyword: String): Result<List<SuggestionData>>
}