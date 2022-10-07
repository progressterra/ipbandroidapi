package com.progressterra.ipbandroidapi.api.checklist

import com.progressterra.ipbandroidapi.api.checklist.model.*
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import java.util.*

interface ChecklistRepository {

    suspend fun createAnswer(request: DRAnswerChekListItemEntity): Result<DRCheckListItemForDHPerformedViewModel?>

    suspend fun updateAnswer(
        idRG: UUID, request: DRAnswerChekListItemUpdated
    ): Result<DRCheckListItemForDHPerformedViewModel?>

    suspend fun createChecklist(request: RFCheckEntity): Result<RFCheck?>

    suspend fun checklists(request: FilterAndSort): Result<List<RFCheck>?>

    suspend fun checklistList(
        idRFComPlace: UUID, request: FilterAndSort
    ): Result<List<RFCheck>?>

    suspend fun availableChecklists(): Result<List<ComPlaceWithData>?>

    suspend fun availableChecklistsForPlace(idComPlace: UUID): Result<List<RFCheckViewModel>?>

    suspend fun availableDocsForPlace(
        idComPlace: UUID, request: FilterAndSort
    ): Result<List<DHCheckPerformedViewModel>?>

    suspend fun createDoc(request: DHCheckPerformedEntity): Result<DHCheckPerformedViewModel?>

    suspend fun startCheck(idDH: UUID): Result<DHCheckPerformedViewModel?>

    suspend fun finishCheck(idDH: UUID, value: String): Result<DHCheckPerformedViewModel?>

    suspend fun checklistForDoc(idDH: UUID): Result<List<DRCheckListItemForDHPerformedViewModel>?>

    class Base(
        private val cloudDataSource: ChecklistCloudDataSource
    ) : AbstractRepository(), ChecklistRepository {

        override suspend fun createAnswer(
            request: DRAnswerChekListItemEntity
        ): Result<DRCheckListItemForDHPerformedViewModel?> = handle {
            val response = cloudDataSource.createAnswer(request)
            if (response.result?.status != 0 )
                throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun updateAnswer(
            idRG: UUID, request: DRAnswerChekListItemUpdated
        ): Result<DRCheckListItemForDHPerformedViewModel?> = handle {
            val response = cloudDataSource.updateAnswer(idRG, request)
            if (response.result?.status != 0 )
                throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun createChecklist(request: RFCheckEntity): Result<RFCheck?> = handle {
            val response = cloudDataSource.createChecklist(request)
            if (response.result?.status != 0 )
                throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun checklists(request: FilterAndSort): Result<List<RFCheck>?> = handle {
            val response = cloudDataSource.checklists(request)
            if (response.result?.status != 0)
                throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun checklistList(
            idRFComPlace: UUID, request: FilterAndSort
        ): Result<List<RFCheck>?> = handle {
            val response = cloudDataSource.checklistList(idRFComPlace, request)
            if (response.result?.status != 0)
                throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun availableChecklists(): Result<List<ComPlaceWithData>?> = handle {
            val response = cloudDataSource.availableChecklists()
            if (response.result?.status != 0)
                throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun availableChecklistsForPlace(
            idComPlace: UUID
        ): Result<List<RFCheckViewModel>?> = handle {
            val response = cloudDataSource.availableChecklistsForPlace(idComPlace)
            if (response.result?.status != 0)
                throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun availableDocsForPlace(
            idComPlace: UUID, request: FilterAndSort
        ): Result<List<DHCheckPerformedViewModel>?> = handle {
            val response = cloudDataSource.availableDocsForPlace(idComPlace, request)
            if (response.result?.status != 0)
                throw BadRequestException()
            response
        }.map {
            it.dataList
        }

        override suspend fun createDoc(
            request: DHCheckPerformedEntity
        ): Result<DHCheckPerformedViewModel?> = handle {
            val response = cloudDataSource.createDoc(request)
            if (response.result?.status != 0 )
                throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun startCheck(idDH: UUID): Result<DHCheckPerformedViewModel?> = handle {
            val response = cloudDataSource.startCheck(idDH)
            if (response.result?.status != 0 )
                throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun finishCheck(
            idDH: UUID, value: String
        ): Result<DHCheckPerformedViewModel?> = handle {
            val response = cloudDataSource.finishCheck(idDH, value)
            if (response.result?.status != 0 )
                throw BadRequestException()
            response
        }.map {
            it.data
        }

        override suspend fun checklistForDoc(
            idDH: UUID
        ): Result<List<DRCheckListItemForDHPerformedViewModel>?> = handle {
            val response = cloudDataSource.checklistForDoc(idDH)
            if (response.result?.status != 0)
                throw BadRequestException()
            response
        }.map {
            it.dataList
        }
    }
}