package com.progressterra.ipbandroidapi.api.checklist

import com.progressterra.ipbandroidapi.api.checklist.model.ComPlaceWithData
import com.progressterra.ipbandroidapi.api.checklist.model.DHCheckPerformedEntityCreate
import com.progressterra.ipbandroidapi.api.checklist.model.DHCheckPerformedFullDataViewModel
import com.progressterra.ipbandroidapi.api.checklist.model.DRAnswerChekListItemEntity
import com.progressterra.ipbandroidapi.api.checklist.model.DRCheckListItemForDHPerformedViewModel
import com.progressterra.ipbandroidapi.api.checklist.model.DRCheckListItemViewModel
import com.progressterra.ipbandroidapi.api.checklist.model.FilterAndSort
import com.progressterra.ipbandroidapi.api.checklist.model.FinalCommentsInput
import com.progressterra.ipbandroidapi.api.checklist.model.RFCheck
import com.progressterra.ipbandroidapi.api.checklist.model.RFCheckEntity
import com.progressterra.ipbandroidapi.api.checklist.model.RFCheckViewModel
import com.progressterra.ipbandroidapi.api.checklist.model.RGComPlaceRFCheckEntity
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

interface ChecklistRepository {

    suspend fun createOrUpdateAnswer(
        accessToken: String, request: DRAnswerChekListItemEntity
    ): Result<DRCheckListItemForDHPerformedViewModel?>

    suspend fun createChecklist(
        accessToken: String, request: RFCheckEntity
    ): Result<RFCheck?>

    suspend fun checklists(
        accessToken: String, request: FilterAndSort
    ): Result<List<RFCheck>?>

    suspend fun checklistsForPlace(
        accessToken: String, idRFComPlace: String, request: FilterAndSort
    ): Result<List<RFCheck>?>

    suspend fun availableChecklistsAndDocs(accessToken: String): Result<List<ComPlaceWithData>?>

    suspend fun availableChecklistsForPlace(
        accessToken: String, idComPlace: String
    ): Result<List<RFCheckViewModel>?>

    suspend fun availableDocsForPlace(
        accessToken: String, idComPlace: String, request: FilterAndSort
    ): Result<List<DHCheckPerformedFullDataViewModel>?>

    suspend fun addChecklistToPlace(
        accessToken: String, request: RGComPlaceRFCheckEntity
    ): Result<Unit>

    suspend fun createDoc(
        accessToken: String, request: DHCheckPerformedEntityCreate
    ): Result<DHCheckPerformedFullDataViewModel?>

    suspend fun startCheck(
        accessToken: String, idDH: String
    ): Result<DHCheckPerformedFullDataViewModel?>

    suspend fun finishCheck(
        accessToken: String, idDH: String, request: FinalCommentsInput
    ): Result<DHCheckPerformedFullDataViewModel?>

    suspend fun checklistForDoc(
        accessToken: String, idDH: String
    ): Result<List<DRCheckListItemForDHPerformedViewModel>?>

    suspend fun allDocuments(
        accessToken: String,
        request: FilterAndSort
    ): Result<List<DHCheckPerformedFullDataViewModel>?>

    suspend fun checklistElements(
        accessToken: String,
        idRFCheck: String,
        request: FilterAndSort
    ): Result<List<DRCheckListItemViewModel>?>

    suspend fun activeDoc(
        accessToken: String,
        placeId: String,
        checklistId: String
    ): Result<DHCheckPerformedFullDataViewModel?>

    class Base(
        handleException: HandleException,
        private val service: ChecklistService,
    ) : AbstractRepository(handleException), ChecklistRepository {

        override suspend fun activeDoc(
            accessToken: String,
            placeId: String,
            checklistId: String
        ): Result<DHCheckPerformedFullDataViewModel?> = handle {
            val response = service.activeDoc(accessToken, placeId, checklistId)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun allDocuments(
            accessToken: String,
            request: FilterAndSort
        ): Result<List<DHCheckPerformedFullDataViewModel>?> = handle {
            val response = service.allDocuments(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun createOrUpdateAnswer(
            accessToken: String, request: DRAnswerChekListItemEntity
        ): Result<DRCheckListItemForDHPerformedViewModel?> = handle {
            val response = service.createOrUpdateAnswer(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun createChecklist(
            accessToken: String, request: RFCheckEntity
        ): Result<RFCheck?> = handle {
            val response = service.createChecklist(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun checklists(
            accessToken: String, request: FilterAndSort
        ): Result<List<RFCheck>?> = handle {
            val response = service.checklists(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun checklistsForPlace(
            accessToken: String, idRFComPlace: String, request: FilterAndSort
        ): Result<List<RFCheck>?> = handle {
            val response = service.checklistsForPlace(accessToken, idRFComPlace, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun availableChecklistsAndDocs(accessToken: String): Result<List<ComPlaceWithData>?> =
            handle {
                val response = service.availableChecklistsAndDocs(accessToken)
                if (response.result?.status != 0) throw BadRequestException()
                response
            }.map {
                it.dataList
            }

        override suspend fun availableChecklistsForPlace(
            accessToken: String, idComPlace: String
        ): Result<List<RFCheckViewModel>?> = handle {
            val response = service.availableChecklistsForPlace(accessToken, idComPlace)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun availableDocsForPlace(
            accessToken: String, idComPlace: String, request: FilterAndSort
        ): Result<List<DHCheckPerformedFullDataViewModel>?> = handle {
            val response = service.availableDocsForPlace(accessToken, idComPlace, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun addChecklistToPlace(
            accessToken: String, request: RGComPlaceRFCheckEntity
        ): Result<Unit> = handle {
            val response = service.addChecklistToPlace(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
        }

        override suspend fun createDoc(
            accessToken: String, request: DHCheckPerformedEntityCreate
        ): Result<DHCheckPerformedFullDataViewModel?> = handle {
            val response = service.createDoc(accessToken, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun startCheck(
            accessToken: String, idDH: String
        ): Result<DHCheckPerformedFullDataViewModel?> = handle {
            val response = service.startCheck(accessToken, idDH)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun finishCheck(
            accessToken: String, idDH: String, request: FinalCommentsInput
        ): Result<DHCheckPerformedFullDataViewModel?> = handle {
            val response = service.finishCheck(accessToken, idDH, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun checklistForDoc(
            accessToken: String, idDH: String
        ): Result<List<DRCheckListItemForDHPerformedViewModel>?> = handle {
            val response = service.checklistForDoc(accessToken, idDH)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun checklistElements(
            accessToken: String,
            idRFCheck: String,
            request: FilterAndSort
        ): Result<List<DRCheckListItemViewModel>?> = handle {
            val response = service.checklistElements(accessToken, idRFCheck, request)
            if (response.result?.status != 0) throw BadRequestException()
            response
        }.map {
            it.dataList
        }
    }
}