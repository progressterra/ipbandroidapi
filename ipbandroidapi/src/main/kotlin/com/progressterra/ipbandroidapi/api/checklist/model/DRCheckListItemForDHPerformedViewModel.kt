package com.progressterra.ipbandroidapi.api.checklist.model

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
 * @param parameter
 * @param answerCheckList
 */
data class DRCheckListItemForDHPerformedViewModel (

    val idRegistrar: String?,
    val iddrCheckListItemEntityTemplate: String?,
    val idrfTestParameters: String?,
    val description: String?,
    val shortDescription: String?,
    val needPhoto: Boolean?,
    val needVideo: Boolean?,
    val needComments: Boolean?,
    val needDecimalSpecificMeaning: Boolean?,
    val needSpecificFreeMeaning: Boolean?,
    val idUnique: String?,
    val idEnterprise: String?,
    val dateAdded: String?,
    val dateUpdated: String?,
    val dateSoftRemoved: String?,
    val parameter: RFTestParameters?,
    val answerCheckList: DRAnswerChekListItemViewModel?
)