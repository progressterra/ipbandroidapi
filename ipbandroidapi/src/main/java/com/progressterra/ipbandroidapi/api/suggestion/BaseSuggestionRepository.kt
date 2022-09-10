package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.SuggestionData
import com.progressterra.ipbandroidapi.core.AbstractRepository

internal class BaseSuggestionRepository(
    private val cloudDataSource: SuggestionCloudDataSource
) : AbstractRepository(), SuggestionRepository {

    override suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): Result<List<SuggestionData>> =
        handle {
            cloudDataSource.getSuggestionsAddressFromDadata(dadataSuggestionsRequest)
        }.map { response -> response.suggestions?.map { SuggestionData(it) } ?: emptyList() }
}