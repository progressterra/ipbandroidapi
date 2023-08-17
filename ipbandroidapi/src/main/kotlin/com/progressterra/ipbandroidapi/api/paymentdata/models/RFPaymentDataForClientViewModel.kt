package com.progressterra.ipbandroidapi.api.paymentdata.models

import com.google.gson.annotations.SerializedName

/**
 * Данные, которые мы можем показать клиентам
 *
 * @param idClient 
 * @param paymentDataType 
 * @param preiview Безопасное представление данных
 * @param hashGeneralData Хеш основных данных по которым можно осуществлять поиск. Например, номер карты  Или номер счета
 * @param hashFullData Хеш полных данных (включающих все реквизиты). Это позволяет понять полностью совпадают все реквизиты или нет
 * @param paymentSystemName Платежная система (Visa, Mastercard)
 * @param idUnique Уникальный идентификатор
 */


data class RFPaymentDataForClientViewModel (

    @SerializedName("idClient")
    val idClient: String? = null,

    @SerializedName("paymentDataType")
    val paymentDataType: TypePaymentData? = null,

    /* Безопасное представление данных */
    @SerializedName("preiview")
    val preiview: String? = null,

    /* Хеш основных данных по которым можно осуществлять поиск. Например, номер карты  Или номер счета */
    @SerializedName("hashGeneralData")
    val hashGeneralData: String? = null,

    /* Хеш полных данных (включающих все реквизиты). Это позволяет понять полностью совпадают все реквизиты или нет */
    @SerializedName("hashFullData")
    val hashFullData: String? = null,

    /* Платежная система (Visa, Mastercard) */
    @SerializedName("paymentSystemName")
    val paymentSystemName: String? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    @SerializedName("dateAdded")
    val dateAdded: String? = null,

    @SerializedName("dateUpdated")
    val dateUpdated: String? = null,

    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String? = null,
)

