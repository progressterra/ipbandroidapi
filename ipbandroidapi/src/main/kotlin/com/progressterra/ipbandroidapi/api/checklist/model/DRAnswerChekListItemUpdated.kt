package com.progressterra.ipbandroidapi.api.checklist.model

/**
 * Данные ответа, которые можем изменять
 * @param yesNo Ответа да или нет. Да - true, нет - false
 * @param comments Комментарий
 * @param rangeValue Значение из диапазаона от 0 до MaxValue из RFCheckListItem
 * @param specificMeaning Конкретное значение с возоможностью дробного ввода. Например остаток конкртеного товара
 * @param specificFreeMeaning Конкретное значение в виде строки. Например свой ответ на вопрос
 */
data class DRAnswerChekListItemUpdated(

    val yesNo: Boolean?,
    val comments: String?,
    val rangeValue: Int?,
    val specificMeaning: Double?,
    val specificFreeMeaning: String?
)