package com.progressterra.ipbandroidapi.api.documents

import com.progressterra.ipbandroidapi.api.documents.models.DHDocSetFullData
import com.progressterra.ipbandroidapi.api.documents.models.DHDocSetViewModel
import com.progressterra.ipbandroidapi.api.documents.models.IncomeDataClientArea
import com.progressterra.ipbandroidapi.api.documents.models.RFCharacteristicValueViewModel
import com.progressterra.ipbandroidapi.api.documents.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException
import okhttp3.MultipartBody

interface DocumentsRepository {

    suspend fun docsBySpecification(
        accessToken: String, idSpecification: String
    ): Result<DHDocSetFullData?>

    suspend fun docsById(
        accessToken: String, idDocSet: String
    ): Result<DHDocSetFullData?>

    suspend fun allDocSets(
        accessToken: String
    ): Result<List<DHDocSetViewModel>?>

    suspend fun setValueForChar(
        accessToken: String, idCharVal: String, incomeData: IncomeDataClientArea
    ): Result<RFCharacteristicValueViewModel?>

    suspend fun setImageForChar(
        accessToken: String, idCharVal: String, file: MultipartBody.Part
    ): Result<RFCharacteristicValueViewModel?>

    class Base(
        handleException: HandleException,
        private val service: DocumentsService
    ) : DocumentsRepository, AbstractRepository(handleException) {

        override suspend fun docsBySpecification(
            accessToken: String, idSpecification: String
        ): Result<DHDocSetFullData?> = handle {
            val response = service.docsBySpecification(accessToken, idSpecification)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun docsById(
            accessToken: String, idDocSet: String
        ): Result<DHDocSetFullData?> = handle {
            val response = service.docsById(accessToken, idDocSet)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun allDocSets(accessToken: String): Result<List<DHDocSetViewModel>?> =
            handle {
                val response = service.allDocSets(accessToken)
                if (response.result?.status != StatusResult.SUCCESS) {
                    throw BadRequestException()
                }
                response.dataList
            }

        override suspend fun setValueForChar(
            accessToken: String, idCharVal: String, incomeData: IncomeDataClientArea
        ): Result<RFCharacteristicValueViewModel?> = handle {
            val response = service.setValueForChar(accessToken, idCharVal, incomeData)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun setImageForChar(
            accessToken: String, idCharVal: String, file: MultipartBody.Part
        ): Result<RFCharacteristicValueViewModel?> = handle {
            val response = service.setImageForChar(accessToken, idCharVal, file)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }
    }
}