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
 */


data class DRAnswerChekListItemEntity (

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
    val specificFreeMeaning: String? = null

)

