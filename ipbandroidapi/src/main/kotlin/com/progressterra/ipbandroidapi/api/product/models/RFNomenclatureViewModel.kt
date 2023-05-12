package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idrfSpecification Идентификатор спецификации, которой принадлежит данная номенклатура
 * @param name Наиименование - может задаваться вручную или генерироваться на основе правил
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param listCatalogCategory Список категорий в которых присутствует номенклатура
 * @param listImages Список изображений
 * @param popularOrder Порядок вывода товара по популярности
 * @param rating Рейтинг товара
 */


data class RFNomenclatureViewModel(

    /* Идентификатор спецификации, которой принадлежит данная номенклатура */
    @SerializedName("idrfSpecification") val idrfSpecification: String? = null,

    /* Наиименование - может задаваться вручную или генерироваться на основе правил */
    @SerializedName("name") val name: String? = null,

    /* Подробное описание товара, используемое для презентации товара */
    @SerializedName("commerseDescription") val commerseDescription: String? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique") val idUnique: String? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise") val idEnterprise: String? = null,

    /* Дата добавления записи */
    @SerializedName("dateAdded") val dateAdded: String? = null,

    /* Дата обновления записи */
    @SerializedName("dateUpdated") val dateUpdated: String? = null,

    /* Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved") val dateSoftRemoved: String? = null,

    /* Список категорий в которых присутствует номенклатура */
    @SerializedName("listCatalogCategory") val listCatalogCategory: List<String>? = null,

    /* Список изображений */
    @SerializedName("listImages") val listImages: List<RGEntitytMediaDataViewModel>? = null,

    /* Порядок вывода товара по популярности */
    @SerializedName("popularOrder") val popularOrder: Int? = null,

    /* Рейтинг товара */
    @SerializedName("rating") val rating: Double? = null

)

