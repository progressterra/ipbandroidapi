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

import org.openapitools.client.models.RFCharacteristicValueViewModel

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idrfNomenclature Идентификатор номенклатуры
 * @param idrfCharacteristicValue Значение характеристики
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param characteristicValueData 
 */


data class RGProductCharacteristicViewModel (

    /* Идентификатор номенклатуры */
    @SerializedName("idrfNomenclature")
    val idrfNomenclature: java.util.UUID? = null,

    /* Значение характеристики */
    @SerializedName("idrfCharacteristicValue")
    val idrfCharacteristicValue: java.util.UUID? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: java.util.UUID? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise")
    val idEnterprise: java.util.UUID? = null,

    /* Дата добавления записи */
    @SerializedName("dateAdded")
    val dateAdded: kotlin.String? = null,

    /* Дата обновления записи */
    @SerializedName("dateUpdated")
    val dateUpdated: kotlin.String? = null,

    /* Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: kotlin.String? = null,

    @SerializedName("characteristicValueData")
    val characteristicValueData: RFCharacteristicValueViewModel? = null

)

