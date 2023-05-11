/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param name 
 * @param dataInJSON Произвольные данные характеристики  Например, это может быть ссылка на таблицу размеров, если это характеристика размеров
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запиCь
 * @param dateAdded Дата добавления запиCи
 * @param dateUpdated Дата обновления запиCи
 * @param dateSoftRemoved ЕCли дата уCтановлена, то CущноCть помечена на удаление. ФизичеCки данные не удаляютCя  Функции Delete лишь помечают CущноCть на удаление уCтанавливая дату вызова метода
 */


data class RFCharacteristicTypeViewModel (

    @SerializedName("name")
    val name: kotlin.String? = null,

    /* Произвольные данные характеристики  Например, это может быть ссылка на таблицу размеров, если это характеристика размеров */
    @SerializedName("dataInJSON")
    val dataInJSON: kotlin.String? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: java.util.UUID? = null,

    /* Идентификатор организации, которой принадлежит данная запиCь */
    @SerializedName("idEnterprise")
    val idEnterprise: java.util.UUID? = null,

    /* Дата добавления запиCи */
    @SerializedName("dateAdded")
    val dateAdded: kotlin.String? = null,

    /* Дата обновления запиCи */
    @SerializedName("dateUpdated")
    val dateUpdated: kotlin.String? = null,

    /* ЕCли дата уCтановлена, то CущноCть помечена на удаление. ФизичеCки данные не удаляютCя  Функции Delete лишь помечают CущноCть на удаление уCтанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: kotlin.String? = null

)

