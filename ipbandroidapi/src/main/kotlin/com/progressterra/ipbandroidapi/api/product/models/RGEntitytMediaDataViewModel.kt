package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idEntity Идентфикатор сущности к которой мы добавляем данные, может быть клиентом, организацией, магазином, продуктом
 * @param entityTypeName Имя типа сущности для которой добавляем данные. Как они идут в IPB
 * @param privateForClientID Если данный параметр установлен в идентификатор клиента, то данные доступны только данному клиенту. Данные также доступны бизнес пользователям организации, а также специалистам платформы
 * @param urlData Ссылка на html документ или ссылка на файл
 * @param stringData Используется для StaticData
 * @param dataJSON
 * @param alias Псевдоним данных. Может использоваться как заголок для данных
 * @param previewText Используется чтобы рассказать о данных
 * @param order Порядок вывода файла в списке
 * @param tag Tag, который позволяет сортировать данные для конкртеной сущности
 * @param contentType
 * @param propertySize
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param listInfoImage
 */
data class RGEntitytMediaDataViewModel(

    /* Идентфикатор сущности к которой мы добавляем данные, может быть клиентом, организацией, магазином, продуктом */
    @SerializedName("idEntity") val idEntity: String? = null,

    /* Имя типа сущности для которой добавляем данные. Как они идут в IPB */
    @SerializedName("entityTypeName") val entityTypeName: String? = null,

    /* Если данный параметр установлен в идентификатор клиента, то данные доступны только данному клиенту. Данные также доступны бизнес пользователям организации, а также специалистам платформы */
    @SerializedName("privateForClientID") val privateForClientID: String? = null,

    /* Ссылка на html документ или ссылка на файл */
    @SerializedName("urlData") val urlData: String? = null,

    /* Используется для StaticData */
    @SerializedName("stringData") val stringData: String? = null,

    @SerializedName("dataJSON") val dataJSON: String? = null,

    /* Псевдоним данных. Может использоваться как заголок для данных */
    @SerializedName("alias") val alias: String? = null,

    /* Используется чтобы рассказать о данных */
    @SerializedName("previewText") val previewText: String? = null,

    /* Порядок вывода файла в списке */
    @SerializedName("order") val order: Int? = null,

    /* Tag, который позволяет сортировать данные для конкртеной сущности */
    @SerializedName("tag") val tag: Int? = null,

    @SerializedName("contentType") val contentType: String? = null,

    @SerializedName("size") val propertySize: Long? = null,

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

    @SerializedName("listInfoImage") val listInfoImage: ListInfoImage? = null

)

