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
 * Спецификация продукта - набор характеристик, которые присущи продукту/номенклатуре и которые должны быть/могут быть у нее заполнены
 *
 * @param idrfSpecification 
 * @param idrfCharacteristicType Тип характеристики, которая присутствует в спецификации продукта
 * @param isMandatory Признак обязательной характеристики, которую нужно обязательно заоплнить
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */


data class RGSpecificationCharacteristicType (

    @SerializedName("idrfSpecification")
    val idrfSpecification: java.util.UUID? = null,

    /* Тип характеристики, которая присутствует в спецификации продукта */
    @SerializedName("idrfCharacteristicType")
    val idrfCharacteristicType: java.util.UUID? = null,

    /* Признак обязательной характеристики, которую нужно обязательно заоплнить */
    @SerializedName("isMandatory")
    val isMandatory: kotlin.Boolean? = null,

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
    val dateSoftRemoved: kotlin.String? = null

)

