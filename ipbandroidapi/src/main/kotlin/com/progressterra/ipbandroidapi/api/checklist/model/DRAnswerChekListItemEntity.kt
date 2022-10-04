package com.progressterra.ipbandroidapi.api.checklist.model

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
 */
internal data class DRAnswerChekListItemEntity(

    val yesNo: Boolean?,
    val comments: String?,
    val rangeValue: Int?,
    val specificMeaning: Double?,
    val specificFreeMeaning: String?,
    val iddhCheckPerformed: UUID?,
    val iddrCheckListItem: UUID?
)