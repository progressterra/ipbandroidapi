package com.progressterra.ipbandroidapi.api.collaboration

import com.progressterra.ipbandroidapi.api.collaboration.models.ResultEnterpriseData
import com.progressterra.ipbandroidapi.api.collaboration.models.ResultListEnterpriseData
import com.progressterra.ipbandroidapi.api.collaboration.models.ResultListShop
import com.progressterra.ipbandroidapi.api.collaboration.models.ResultOfferList
import retrofit2.http.GET
import retrofit2.http.Path

interface CollaborationService {

    @GET("/mobile/enterprise/list/{AccessToken}/{latitude}/{longitude}")
    suspend fun partners(
        @Path("AccessToken") accessToken: String,
        @Path("latitude") latitude: String,
        @Path("longitude") longitude: String
    ): ResultListEnterpriseData

    @GET("/collaboration/complace/list/{AccessToken}/{latitude}/{longitude}/{IDEnterprise}")
    suspend fun organizationShops(
        @Path("AccessToken") accessToken: String,
        @Path("latitude") latitude: String,
        @Path("longitude") longitude: String,
        @Path("IDEnterprise") organizationId: String
    ): ResultListShop

    @GET("/mobile/enterprise/{AccessToken}/{latitude}/{longitude}/{IDEnterprise}")
    suspend fun organizationById(
        @Path("AccessToken") accessToken: String,
        @Path("latitude") latitude: String,
        @Path("longitude") longitude: String,
        @Path("IDEnterprise") organizationId: String
    ): ResultEnterpriseData

    @GET("/collaboration/offers/mobile/list/{AccessToken}/{latitude}/{longitude}/{IDEnterprise}")
    suspend fun offersByOrganization(
        @Path("AccessToken") accessToken: String,
        @Path("latitude") latitude: String,
        @Path("longitude") longitude: String,
        @Path("IDEnterprise") organizationId: String
    ): ResultOfferList
}