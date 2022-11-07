package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsFromLocationRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.SuggestionData
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseSuggestionRepository(
    handleException: HandleException,
    private val service: SuggestionService
) : AbstractRepository(handleException), SuggestionRepository {

    override suspend fun getSuggestionsAddressFromDadata(
        keyword: String, count: Int
    ): Result<List<SuggestionData>> = handle {
        service.getSuggestionsAddressFromDadata(
            DadataSuggestionsRequest(
                keyword, count
            )
        )
    }.map { response -> response.suggestions?.map { SuggestionData(it) } ?: emptyList() }

    override suspend fun getSuggestionsAddressFromLocation(
        latitude: Float, longitude: Float, count: Int
    ): Result<List<SuggestionData>> = handle {
        service.getSuggestionsAddressFromLocation(
            DadataSuggestionsFromLocationRequest(
                latitude, longitude, count
            )
        )
    }.map { response -> response.suggestions?.map { SuggestionData(it) } ?: emptyList() }
}