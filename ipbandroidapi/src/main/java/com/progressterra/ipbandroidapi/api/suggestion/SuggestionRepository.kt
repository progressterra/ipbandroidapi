package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.SuggestionInfo
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface SuggestionRepository {

    suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): Result<List<SuggestionInfo>>

    class Base(
        private val cloudDataSource: SuggestionCloudDataSource
    ) : AbstractRepository(), SuggestionRepository {

        override suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): Result<List<SuggestionInfo>> =
            handle {
                cloudDataSource.getSuggestionsAddressFromDadata(dadataSuggestionsRequest)
            }.map { response -> response.suggestions?.map { it.toSuggestionInfo() } ?: emptyList() }
    }
}