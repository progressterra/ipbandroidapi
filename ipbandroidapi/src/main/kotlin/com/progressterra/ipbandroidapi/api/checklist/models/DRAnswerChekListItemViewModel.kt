package com.progressterra.ipbandroidapi.api.checklist.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param iddrCheckListItem Конкретный элемент списка
 * @param yesNo Ответа да или нет. Да - true, нет - false
 * @param comments Комментарий
 * @param rangeValue Значение из диапазаона от 0 до MaxValue из RFCheckListItem
 * @param specificMeaning Конкретное значение с возоможностью дробного ввода. Например остаток конкртеного товара
 * @param specificFreeMeaning Конкретное значение в виде строки. Например свой ответ на вопрос
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param iddhCheckPerformed Документ в рамках которого идет проверка
 * @param idClient Кто ответил на вопрос. Избыточная информация, т.к. ее можно получить через DHCheckPerformed, но позволяет получить более легкую группировку и фильтрацию
 * @param idrfCheck Чек лист. Избыточная информация, т.к. ее можно получить через DHCheckPerformed, но позволяет получить более легкую группировку и фильтрацию
 */


data class DRAnswerChekListItemViewModel (

    /* Конкретный элемент списка */
    @SerializedName("iddrCheckListItem")
    val iddrCheckListItem: String? = null,

    /* Ответа да или нет. Да - true, нет - false */
    @SerializedName("yesNo")
    val yesNo: Boolean? = null,

    /* Комментарий */
    @SerializedName("comments")
    val comments: String? = null,

    /* Значение из диапазаона от 0 до MaxValue из RFCheckListItem */
    @SerializedName("rangeValue")
    val rangeValue: Int? = null,

    /* Конкретное значение с возоможностью дробного ввода. Например остаток конкртеного товара */
    @SerializedName("specificMeaning")
    val specificMeaning: Double? = null,

    /* Конкретное значение в виде строки. Например свой ответ на вопрос */
    @SerializedName("specificFreeMeaning")
    val specificFreeMeaning: String? = null,

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

    /* Документ в рамках которого идет проверка */
    @SerializedName("iddhCheckPerformed")
    val iddhCheckPerformed: String? = null,

    /* Кто ответил на вопрос. Избыточная информация, т.к. ее можно получить через DHCheckPerformed, но позволяет получить более легкую группировку и фильтрацию */
    @SerializedName("idClient")
    val idClient: String? = null,

    /* Чек лист. Избыточная информация, т.к. ее можно получить через DHCheckPerformed, но позволяет получить более легкую группировку и фильтрацию */
    @SerializedName("idrfCheck")
    val idrfCheck: String? = null

)

