package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idrfNomenclatura Идентификатор номенклатуры товара
 * @param idrfComPlace Идентификтор коммерческой точки (магазин или склад), в которой находится товар
 * @param quantity Количество товара
 * @param idDiscountBasisForBeginPrice Идентификатор скидки на основании которой получена текущая цена (BeginPrice)
 * @param beginPrice Первоначальная цена товара
 * @param currentPrice Цена с учетом скидок
 * @param minPrice Минимальная цена, по которой можно продать данный товар. Даже если максимальная скидка дает меньшую цену - этот параметр не позволяет опуститься ниже него
 * @param maxValueDiscount Максимальная скидка, которая может быть сделана. Принимает значение от 0 до 1 (100%)  На основе данного параметра и текущей скидки можно вычислить какую скидку можно еще сделать, например, бонусами  Используется для расчета цены товара, но если цена товара получается ниже чем MinPrice - применяется MinPrice
 * @param kiz Контрольно идентификационный знак
 * @param defectName Наименование дефекта товара, если он есть. Если заполнено, то является признаком уценки
 * @param idExternalSystem Идентификатор внешней системы, с которой производится интеграция. Например, идентификатор WooCcommerce
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */
data class RGGoodsInventoryViewModel(

    /* Идентификатор номенклатуры товара */
    @SerializedName("idrfNomenclatura") val idrfNomenclatura: String? = null,

    /* Идентификтор коммерческой точки (магазин или склад), в которой находится товар */
    @SerializedName("idrfComPlace") val idrfComPlace: String? = null,

    /* Количество товара */
    @SerializedName("quantity") val quantity: Int? = null,

    /* Идентификатор скидки на основании которой получена текущая цена (BeginPrice) */
    @SerializedName("idDiscountBasisForBeginPrice") val idDiscountBasisForBeginPrice: String? = null,

    /* Первоначальная цена товара */
    @SerializedName("beginPrice") val beginPrice: Double? = null,

    /* Цена с учетом скидок */
    @SerializedName("currentPrice") val currentPrice: Double? = null,

    /* Минимальная цена, по которой можно продать данный товар. Даже если максимальная скидка дает меньшую цену - этот параметр не позволяет опуститься ниже него */
    @SerializedName("minPrice") val minPrice: Double? = null,

    /* Максимальная скидка, которая может быть сделана. Принимает значение от 0 до 1 (100%)  На основе данного параметра и текущей скидки можно вычислить какую скидку можно еще сделать, например, бонусами  Используется для расчета цены товара, но если цена товара получается ниже чем MinPrice - применяется MinPrice */
    @SerializedName("maxValueDiscount") val maxValueDiscount: Double? = null,

    /* Контрольно идентификационный знак */
    @SerializedName("kiz") val kiz: String? = null,

    /* Наименование дефекта товара, если он есть. Если заполнено, то является признаком уценки */
    @SerializedName("defectName") val defectName: String? = null,

    /* Идентификатор внешней системы, с которой производится интеграция. Например, идентификатор WooCcommerce */
    @SerializedName("idExternalSystem") val idExternalSystem: String? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique") val idUnique: String? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise") val idEnterprise: String? = null,

    /* Дата добавления записи */
    @SerializedName("dateAdded") val dateAdded: String? = null,

    /* Дата обновления записи */
    @SerializedName("dateUpdated") val dateUpdated: String? = null,

    /* Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved") val dateSoftRemoved: String? = null
)
