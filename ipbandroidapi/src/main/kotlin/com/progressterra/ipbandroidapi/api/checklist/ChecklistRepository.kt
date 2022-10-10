package com.progressterra.ipbandroidapi.api.checklist

import com.progressterra.ipbandroidapi.api.checklist.model.*
import com.progressterra.ipbandroidapi.api.checklist.model.DHCheckPerformedEntityCreate
import com.progressterra.ipbandroidapi.api.checklist.model.DHCheckPerformedFullDataViewModel
import com.progressterra.ipbandroidapi.api.checklist.model.RGComPlaceRFCheckEntity
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.ext.orIfNull

interface ChecklistRepository {

    suspend fun createAnswer(
        accessToken: String, request: DRAnswerChekListItemEntity
    ): Result<DRCheckListItemForDHPerformedViewModel>

    suspend fun createChecklist(
        accessToken: String, request: RFCheckEntity
    ): Result<RFCheck>

    suspend fun checklists(
        accessToken: String, request: FilterAndSort
    ): Result<List<RFCheck>>

    suspend fun checklistList(
        accessToken: String, idRFComPlace: String, request: FilterAndSort
    ): Result<List<RFCheck>>

    suspend fun availableChecklists(accessToken: String): Result<List<ComPlaceWithData>>

    suspend fun availableChecklistsForPlace(
        accessToken: String, idComPlace: String
    ): Result<List<RFCheckViewModel>>

    suspend fun availableDocsForPlace(
        accessToken: String, idComPlace: String, request: FilterAndSort
    ): Result<List<DHCheckPerformedFullDataViewModel>>

    suspend fun addChecklistToPlace(
        accessToken: String, request: RGComPlaceRFCheckEntity
    ): Result<Unit>

    suspend fun createDoc(
        accessToken: String, request: DHCheckPerformedEntityCreate
    ): Result<DHCheckPerformedFullDataViewModel>

    suspend fun startCheck(
        accessToken: String, idDH: String
    ): Result<DHCheckPerformedFullDataViewModel>

    suspend fun finishCheck(
        accessToken: String, idDH: String, request: FinalCommentsInput
    ): Result<DHCheckPerformedFullDataViewModel>

    suspend fun checklistForDoc(
        accessToken: String, idDH: String
    ): Result<List<DRCheckListItemForDHPerformedViewModel>>

    class Base(
        private val cloudDataSource: ChecklistCloudDataSource
    ) : AbstractRepository(), ChecklistRepository {

        override suspend fun createAnswer(
            accessToken: String, request: DRAnswerChekListItemEntity
        ): Result<DRCheckListItemForDHPerformedViewModel> = handle {
            val response = cloudDataSource.createAnswer(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data.orIfNull { throw  BadRequestException() }
        }

        override suspend fun createChecklist(
            accessToken: String, request: RFCheckEntity
        ): Result<RFCheck> = handle {
            val response = cloudDataSource.createChecklist(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data.orIfNull { throw  BadRequestException() }
        }

        override suspend fun checklists(
            accessToken: String, request: FilterAndSort
        ): Result<List<RFCheck>> = handle {
            val response = cloudDataSource.checklists(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList.orIfNull { throw  BadRequestException() }
        }

        override suspend fun checklistList(
            accessToken: String, idRFComPlace: String, request: FilterAndSort
        ): Result<List<RFCheck>> = handle {
            val response = cloudDataSource.checklistList(accessToken, idRFComPlace, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList.orIfNull { throw  BadRequestException() }
        }

        override suspend fun availableChecklists(accessToken: String): Result<List<ComPlaceWithData>> =
            handle {
                val response = cloudDataSource.availableChecklists(accessToken)
                if (response.result?.status != 0) throw BadRequestException()
                response
            }.map {
                it.dataList.orIfNull { throw  BadRequestException() }
            }

        override suspend fun availableChecklistsForPlace(
            accessToken: String, idComPlace: String
        ): Result<List<RFCheckViewModel>> = handle {
            val response = cloudDataSource.availableChecklistsForPlace(accessToken, idComPlace)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList.orIfNull { throw  BadRequestException() }
        }

        override suspend fun availableDocsForPlace(
            accessToken: String, idComPlace: String, request: FilterAndSort
        ): Result<List<DHCheckPerformedFullDataViewModel>> = handle {
            val response = cloudDataSource.availableDocsForPlace(accessToken, idComPlace, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList.orIfNull { throw  BadRequestException() }
        }

        override suspend fun addChecklistToPlace(
            accessToken: String, request: RGComPlaceRFCheckEntity
        ): Result<Unit> = handle {
            val response = cloudDataSource.addChecklistToPlace(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
        }

        override suspend fun createDoc(
            accessToken: String, request: DHCheckPerformedEntityCreate
        ): Result<DHCheckPerformedFullDataViewModel> = handle {
            val response = cloudDataSource.createDoc(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data.orIfNull { throw  BadRequestException() }
        }

        override suspend fun startCheck(
            accessToken: String, idDH: String
        ): Result<DHCheckPerformedFullDataViewModel> = handle {
            val response = cloudDataSource.startCheck(accessToken, idDH)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data.orIfNull { throw  BadRequestException() }
        }

        override suspend fun finishCheck(
            accessToken: String, idDH: String, request: FinalCommentsInput
        ): Result<DHCheckPerformedFullDataViewModel> = handle {
            val response = cloudDataSource.finishCheck(accessToken, idDH, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data.orIfNull { throw  BadRequestException() }
        }

        override suspend fun checklistForDoc(
            accessToken: String, idDH: String
        ): Result<List<DRCheckListItemForDHPerformedViewModel>> = handle {
            val response = cloudDataSource.checklistForDoc(accessToken, idDH)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList.orIfNull { throw  BadRequestException() }
        }
    }
}