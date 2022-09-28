package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsRequest
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * [Docs](https://suggestions.dadata.ru/)
 */
internal interface SuggestionService {

    @Headers("Authorization: Token 444220bc01c3cb6a7bd102bdfb72175a2deee88e")
    @POST("suggestions/api/4_1/rs/suggest/address")
    suspend fun getSuggestionsAddressFromDadata(@Body dadataSuggestionsRequest: DadataSuggestionsRequest): DadataSuggestionResponse
}