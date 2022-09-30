package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsFromLocationRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.SuggestionData
import com.progressterra.ipbandroidapi.core.AbstractRepository

internal class BaseSuggestionRepository(
    private val cloudDataSource: SuggestionCloudDataSource
) : AbstractRepository(), SuggestionRepository {

    override suspend fun getSuggestionsAddressFromDadata(
        keyword: String, count: Int
    ): Result<List<SuggestionData>> = handle {
        cloudDataSource.getSuggestionsAddressFromDadata(
            DadataSuggestionsRequest(
                keyword, count
            )
        )
    }.map { response -> response.suggestions?.map { SuggestionData(it) } ?: emptyList() }

    override suspend fun getSuggestionsAddressFromLocation(
        latitude: Float, longitude: Float, count: Int
    ): Result<List<SuggestionData>> = handle {
        cloudDataSource.getSuggestionsAddressFromLocation(
            DadataSuggestionsFromLocationRequest(
                latitude, longitude, count
            )
        )
    }.map { response -> response.suggestions?.map { SuggestionData(it) } ?: emptyList() }
}