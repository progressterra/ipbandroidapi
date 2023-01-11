package com.progressterra.ipbandroidapi.api.collaboration

import com.progressterra.ipbandroidapi.api.collaboration.models.ResultListEnterpriseData
import com.progressterra.ipbandroidapi.api.collaboration.models.ResultListShop
import retrofit2.http.GET

interface CollaborationService {

    @GET("/mobile/enterprise/list/{AccessToken}/{latitude}/{longitude}")
    suspend fun partners(
        accessToken: String, latitude: String, longitude: String
    ): ResultListEnterpriseData

    @GET("/collaboration/complace/list/{AccessToken}/{latitude}/{longitude}/{IDEnterprise}")
    suspend fun organizationShops(
        accessToken: String, latitude: String, longitude: String, organizationId: String
    ): ResultListShop
}