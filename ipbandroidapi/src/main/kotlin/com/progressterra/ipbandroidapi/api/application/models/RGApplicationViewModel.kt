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

package com.progressterra.ipbandroidapi.api.application.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idProduct Идентификатор продукта, который показываем
 * @param nameClient Имя клиента ОБЯЗАТЕЛЬНОЕ ПОЛЕ Может быть пустым
 * @param sonameClient Фамилия клиента
 * @param phoneNumber Номер телефона клиента ОБЯЗАТЕЛЬНОЕ ПОЛЕ Может быть пустым
 * @param email Эмейл клиента ОБЯЗАТЕЛЬНОЕ ПОЛЕ Может быть пустым
 * @param idTelegram Идентификатор телеграмма клиента
 * @param idChannel Идентификатор произвольного канала,
 * @param nameOfChannel Наименование произвольного канала
 * @param message Произвольное сообщение
 * @param idClient Идентификатор клиента (может быть установлен позже после регистрации клиента в системе)
 * @param idOrder Идентификатор заказа, который создан на основании данной заявки
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */


data class RGApplicationViewModel (

    /* Идентификатор продукта, который показываем */
    @SerializedName("idProduct")
    val idProduct: String? = null,

    /* Имя клиента ОБЯЗАТЕЛЬНОЕ ПОЛЕ Может быть пустым */
    @SerializedName("nameClient")
    val nameClient: kotlin.String? = null,

    /* Фамилия клиента */
    @SerializedName("sonameClient")
    val sonameClient: kotlin.String? = null,

    /* Номер телефона клиента ОБЯЗАТЕЛЬНОЕ ПОЛЕ Может быть пустым */
    @SerializedName("phoneNumber")
    val phoneNumber: kotlin.String? = null,

    /* Эмейл клиента ОБЯЗАТЕЛЬНОЕ ПОЛЕ Может быть пустым */
    @SerializedName("email")
    val email: kotlin.String? = null,

    /* Идентификатор телеграмма клиента */
    @SerializedName("idTelegram")
    val idTelegram: kotlin.String? = null,

    /* Идентификатор произвольного канала, */
    @SerializedName("idChannel")
    val idChannel: kotlin.String? = null,

    /* Наименование произвольного канала */
    @SerializedName("nameOfChannel")
    val nameOfChannel: kotlin.String? = null,

    /* Произвольное сообщение */
    @SerializedName("message")
    val message: kotlin.String? = null,

    /* Идентификатор клиента (может быть установлен позже после регистрации клиента в системе) */
    @SerializedName("idClient")
    val idClient: String? = null,

    /* Идентификатор заказа, который создан на основании данной заявки */
    @SerializedName("idOrder")
    val idOrder: String? = null,

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
    val dateSoftRemoved: String? = null

)

