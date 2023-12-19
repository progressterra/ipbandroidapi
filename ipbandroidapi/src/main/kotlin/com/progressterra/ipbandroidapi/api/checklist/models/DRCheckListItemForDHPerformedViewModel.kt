package com.progressterra.ipbandroidapi.api.checklist.models

import com.google.gson.annotations.SerializedName

/**
 * 
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

    /* Идентфиикатор RFCheck - если это элемент шаблона чек листа или DHCheckPerformed если это строка документа проверки/задания */
    @SerializedName("idRegistrar")
    val idRegistrar: String? = null,

    /* На основании какой именно строки шаблона была содана данная строка.  Данное поле необходимо, чтобы можно было строить статистику по ответам */
    @SerializedName("iddrCheckListItemEntityTemplate")
    val iddrCheckListItemEntityTemplate: String? = null,

    /* Параметр в котором находится данный элемент/вопрос */
    @SerializedName("idrfTestParameters")
    val idrfTestParameters: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("shortDescription")
    val shortDescription: String? = null,

    /* Требуется фото */
    @SerializedName("needPhoto")
    val needPhoto: Boolean? = null,

    /* Требуется видео или голосовое сообщение */
    @SerializedName("needVideo")
    val needVideo: Boolean? = null,

    /* Требуется комментарий */
    @SerializedName("needComments")
    val needComments: Boolean? = null,

    /* Требуется обязательно указать конкретное значение в виде числа */
    @SerializedName("needDecimalSpecificMeaning")
    val needDecimalSpecificMeaning: Boolean? = null,

    /* Требуется обязательно указать конкретное значение в свобоодной строки */
    @SerializedName("needSpecificFreeMeaning")
    val needSpecificFreeMeaning: Boolean? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    /* Дата добавления записи */
    @SerializedName("dateAdded")
    val dateAdded: String? = null,

    /* Дата обновления записи */
    @SerializedName("dateUpdated")
    val dateUpdated: String? = null,

    /* Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String? = null,

    @SerializedName("parameter")
    val parameter: RFTestParameters? = null,

    @SerializedName("answerCheckList")
    val answerCheckList: DRAnswerChekListItemViewModel? = null

)

