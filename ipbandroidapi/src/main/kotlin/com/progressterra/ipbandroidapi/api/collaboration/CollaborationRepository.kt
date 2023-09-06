package com.progressterra.ipbandroidapi.api.collaboration

import com.progressterra.ipbandroidapi.api.collaboration.models.RFShop
import com.progressterra.ipbandroidapi.api.collaboration.models.RGEnterpriseData
import com.progressterra.ipbandroidapi.api.collaboration.models.RGOffersExt
import com.progressterra.ipbandroidapi.api.collaboration.models.StatusResult
import com.progressterra.ipbandroidapi.core.BadRequestException

interface CollaborationRepository {

    suspend fun partners(
        accessToken: String, latitude: String, longitude: String
    ): Result<List<RGEnterpriseData>?>

    suspend fun organizationShops(
        accessToken: String, latitude: String, longitude: String, organizationId: String
    ): Result<List<RFShop>?>

    suspend fun organizationById(
        accessToken: String, latitude: String, longitude: String, organizationId: String
    ): Result<RGEnterpriseData?>

    suspend fun offersByOrganization(
        accessToken: String,
        latitude: String,
        longitude: String,
        organizationId: String
    ): Result<List<RGOffersExt>?>

    class Base(
        private val service: CollaborationService
    ) : CollaborationRepository {

        override suspend fun organizationById(
            accessToken: String,
            latitude: String,
            longitude: String,
            organizationId: String
        ): Result<RGEnterpriseData?> = runCatching {
            val response =
                service.organizationById(accessToken, latitude, longitude, organizationId)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }

        override suspend fun partners(
            accessToken: String,
            latitude: String,
            longitude: String
        ): Result<List<RGEnterpriseData>?> = runCatching {
            val response = service.partners(accessToken, latitude, longitude)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.dataList
        }

        override suspend fun organizationShops(
            accessToken: String,
            latitude: String,
            longitude: String,
            organizationId: String
        ): Result<List<RFShop>?> = runCatching {
            val response =
                service.organizationShops(accessToken, latitude, longitude, organizationId)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.dataList
        }

        override suspend fun offersByOrganization(
            accessToken: String,
            latitude: String,
            longitude: String,
            organizationId: String
        ): Result<List<RGOffersExt>?> = runCatching {
            val response =
                service.offersByOrganization(accessToken, latitude, longitude, organizationId)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.dataList
        }
    }
}