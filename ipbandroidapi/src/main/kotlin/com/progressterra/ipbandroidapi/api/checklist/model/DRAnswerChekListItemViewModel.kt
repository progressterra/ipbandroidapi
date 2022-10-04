package com.progressterra.ipbandroidapi.api.checklist.model

import java.time.LocalDateTime
import java.util.*

/**
 *
 * @param yesNo Ответа да или нет. Да - true, нет - false
 * @param comments Комментарий
 * @param rangeValue Значение из диапазаона от 0 до MaxValue из RFCheckListItem
 * @param specificMeaning Конкретное значение с возоможностью дробного ввода. Например остаток конкртеного товара
 * @param specificFreeMeaning Конкретное значение в виде строки. Например свой ответ на вопрос
 * @param iddhCheckPerformed Документ в рамках которого идет проверка
 * @param iddrCheckListItem Конкретный элемент списка
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param idClient Кто ответил на вопрос. Избыточная информация, т.к. ее можно получить через DHCheckPerformed, но позволяет получить более легкую группировку и фильтрацию
 * @param idrfCheck Чек лист. Избыточная информация, т.к. ее можно получить через DHCheckPerformed, но позволяет получить более легкую группировку и фильтрацию
 */
internal data class DRAnswerChekListItemViewModel(

    val yesNo: Boolean?,
    val comments: String?,
    val rangeValue: Int?,
    val specificMeaning: Double?,
    val specificFreeMeaning: String?,
    val iddhCheckPerformed: UUID?,
    val iddrCheckListItem: UUID?,
    val idUnique: UUID?,
    val idEnterprise: UUID?,
    val dateAdded: LocalDateTime?,
    val dateUpdated: LocalDateTime?,
    val dateSoftRemoved: LocalDateTime?,
    val idClient: UUID?,
    val idrfCheck: UUID?
)