package com.progressterra.ipbandroidapi.api.catalog.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idParentCategory Если это не корень каталога, то содержит информацию о предке
 * @param displayingType 
 * @param formatViewProductType 
 * @param name Наименование категории каталога
 * @param description Дополнительное описание элемента каталога
 * @param imageDataInJSON Данные изображения категории каталога в JSON формате
 * @param order Порядок вывода категории
 * @param extID Иднетификтаор из внешней системы
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param imageData 
 */


data class RFCatalogCategoryViewModel (

    /* Если это не корень каталога, то содержит информацию о предке */
    @SerializedName("idParentCategory")
    val idParentCategory: String? = null,

    @SerializedName("displayingType")
    val displayingType: TypeDisplayCategoryCatalog? = null,

    @SerializedName("formatViewProductType")
    val formatViewProductType: TypeFormatViewProduct? = null,

    /* Наименование категории каталога */
    @SerializedName("name")
    val name: String? = null,

    /* Дополнительное описание элемента каталога */
    @SerializedName("description")
    val description: String? = null,

    /* Данные изображения категории каталога в JSON формате */
    @SerializedName("imageDataInJSON")
    val imageDataInJSON: String? = null,

    /* Порядок вывода категории */
    @SerializedName("order")
    val order: Int? = null,

    /* Иднетификтаор из внешней системы */
    @SerializedName("extID")
    val extID: String? = null,

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

    @SerializedName("imageData")
    val imageData: RGEntitytMediaDataViewModel? = null

)

