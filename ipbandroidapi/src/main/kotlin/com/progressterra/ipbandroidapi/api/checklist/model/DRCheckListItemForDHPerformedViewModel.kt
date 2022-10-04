package com.progressterra.ipbandroidapi.api.checklist.model

import java.time.LocalDateTime
import java.util.*

/**
 *
 * @param idRegistrar Идентфиикатор RFCheck - если это элемент шаблона чек листа или DHCheckPerformed если это строка документа проверки/задания
 * @param iddrCheckListItemEntityTemplate На основании какой именно строки шаблона была содана данная строка.  Данное поле необходимо, чтобы можно было строить статистику по ответам
 * @param idrfTestParameters Параметр в котором находится данный элемент/вопрос
 * @param description
 * @param shortDescription
 * @param needPhoto Требуется фото
 * @param needVideo Требуется видео или голосовое сообщение
 * @param needComments Требуется комментарий
 * @param needDecimalSpecificMeaning Требуется обязательно указать конкретное значение в виде числа
 * @param needSpecificFreeMeaning Требуется обязательно указать конкретное значение в свобоодной строки
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param nameCategory
 * @param answerCheckList
 */
internal data class DRCheckListItemForDHPerformedViewModel(

    val idRegistrar: UUID?,
    val iddrCheckListItemEntityTemplate: UUID?,
    val idrfTestParameters: UUID?,
    val description: String?,
    val shortDescription: String?,
    val needPhoto: Boolean?,
    val needVideo: Boolean?,
    val needComments: Boolean?,
    val needDecimalSpecificMeaning: Boolean?,
    val needSpecificFreeMeaning: Boolean?,
    val idUnique: UUID?,
    val idEnterprise: UUID?,
    val dateAdded: LocalDateTime?,
    val dateUpdated: LocalDateTime?,
    val dateSoftRemoved: LocalDateTime?,
    val nameCategory: String?,
    val answerCheckList: DRAnswerChekListItemViewModel?
)