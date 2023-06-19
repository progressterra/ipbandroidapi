package com.progressterra.ipbandroidapi.api.cart.models

import com.google.gson.annotations.SerializedName

/**
 * Версия документа продажи как заказа
 *
 * @param statusOrder 
 * @param number Номер документа
 * @param numberInt Автоинкрементируемый номер документа
 * @param typeSaleReturn 
 * @param idrfShop Идентификатор магазина в котороом сделана продажа
 * @param idClient Идентификатор клиента
 * @param adressString Адрес доставки в виде строкового описания
 * @param idExtDataAddress Идентификатор объекта адреса из внешней системы
 * @param datePosted Дата окончального проведения документа. Если она есть - можем отправлять на сервер \\  Устанавливается когда распечатали документ на ККМ
 * @param iddhPreSale Идентификатор заказа из интернет магазина или мобильного приложения, на основании которого производим выдачу товара  Используется если надо пробить в оффлайн магазине товар, который был заказан по интернету
 * @param idrfCashier Идентификатор кассира от имени которого прошла продажа
 * @param beginTimeService Время открытия документа
 * @param endTimeService Время закрытия документа
 * @param datePostedAddBonuses Дата расчета добавления бонусов
 * @param datePostedWritingBonuses Дата расчета списания бонусов
 * @param dateSync Дата синхронизации с сервером iCS
 * @param dateSyncWithExternalERP Дата синхронизации клиента, с внешней учетной системой
 * @param idrgCashChange Идентификатор кассовой смены в который была проведена продажа
 * @param currentPositionInCashCahnge Номер чека в текущей кассовой смене
 * @param fiscalCheckNumber Фискальный номер документа
 * @param fDocumentNumber Номер документа полученный из кассы
 * @param fiscalCheckFN Кассовые атрибуты
 * @param fiscalCheckFD 
 * @param fiscalCheckFP 
 * @param dateToSend Дата отправки заказа как запланировано
 * @param dateConfirm Дата подтверждения заказа оператором
 * @param dateCollection Дата сбора заказа
 * @param dateTranssferToSend Дата передачи заказа в службу доставки
 * @param dateStartProcessingDelivery Дата начала доставки именно данного заказа
 * @param dateCustomerReceived Когда клиент получил заказ
 * @param dateClose Дата закрытия заказа. Может быть не закрыт, если нужна еще оплата
 * @param idEmployyeOrderPicker Кто собрал заказ
 * @param idEmployyeCourier Кто отвез заказ
 * @param idExternalERP Идентификатор внешений учетной системы, который устанавливается в момент загрузки документа во внешнюю учетную систему
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param listDRSale 
 * @param listDRComment 
 */


data class DHSaleHeadAsOrderViewModel (

    @SerializedName("statusOrder")
    val statusOrder: TypeStatusOrder? = null,

    /* Номер документа */
    @SerializedName("number")
    val number: String? = null,

    /* Автоинкрементируемый номер документа */
    @SerializedName("numberInt")
    val numberInt: Int? = null,

    @SerializedName("typeSaleReturn")
    val typeSaleReturn: TypeSaleReturn? = null,

    /* Идентификатор магазина в котороом сделана продажа */
    @SerializedName("idrfShop")
    val idrfShop: String? = null,

    /* Идентификатор клиента */
    @SerializedName("idClient")
    val idClient: String? = null,

    /* Адрес доставки в виде строкового описания */
    @SerializedName("adressString")
    val adressString: String? = null,

    /* Идентификатор объекта адреса из внешней системы */
    @SerializedName("idExtDataAddress")
    val idExtDataAddress: String? = null,

    /* Дата окончального проведения документа. Если она есть - можем отправлять на сервер \\  Устанавливается когда распечатали документ на ККМ */
    @SerializedName("datePosted")
    val datePosted: String? = null,

    /* Идентификатор заказа из интернет магазина или мобильного приложения, на основании которого производим выдачу товара  Используется если надо пробить в оффлайн магазине товар, который был заказан по интернету */
    @SerializedName("iddhPreSale")
    val iddhPreSale: String? = null,

    /* Идентификатор кассира от имени которого прошла продажа */
    @SerializedName("idrfCashier")
    val idrfCashier: String? = null,

    /* Время открытия документа */
    @SerializedName("beginTimeService")
    val beginTimeService: String? = null,

    /* Время закрытия документа */
    @SerializedName("endTimeService")
    val endTimeService: String? = null,

    /* Дата расчета добавления бонусов */
    @SerializedName("datePostedAddBonuses")
    val datePostedAddBonuses: String? = null,

    /* Дата расчета списания бонусов */
    @SerializedName("datePostedWritingBonuses")
    val datePostedWritingBonuses: String? = null,

    /* Дата синхронизации с сервером iCS */
    @SerializedName("dateSync")
    val dateSync: String? = null,

    /* Дата синхронизации клиента, с внешней учетной системой */
    @SerializedName("dateSyncWithExternalERP")
    val dateSyncWithExternalERP: String? = null,

    /* Идентификатор кассовой смены в который была проведена продажа */
    @SerializedName("idrgCashChange")
    val idrgCashChange: String? = null,

    /* Номер чека в текущей кассовой смене */
    @SerializedName("currentPositionInCashCahnge")
    val currentPositionInCashCahnge: Long? = null,

    /* Фискальный номер документа */
    @SerializedName("fiscalCheckNumber")
    val fiscalCheckNumber: Int? = null,

    /* Номер документа полученный из кассы */
    @SerializedName("fDocumentNumber")
    val fDocumentNumber: Int? = null,

    /* Кассовые атрибуты */
    @SerializedName("fiscalCheckFN")
    val fiscalCheckFN: String? = null,

    @SerializedName("fiscalCheckFD")
    val fiscalCheckFD: String? = null,

    @SerializedName("fiscalCheckFP")
    val fiscalCheckFP: String? = null,

    /* Дата отправки заказа как запланировано */
    @SerializedName("dateToSend")
    val dateToSend: String? = null,

    /* Дата подтверждения заказа оператором */
    @SerializedName("dateConfirm")
    val dateConfirm: String? = null,

    /* Дата сбора заказа */
    @SerializedName("dateCollection")
    val dateCollection: String? = null,

    /* Дата передачи заказа в службу доставки */
    @SerializedName("dateTranssferToSend")
    val dateTranssferToSend: String? = null,

    /* Дата начала доставки именно данного заказа */
    @SerializedName("dateStartProcessingDelivery")
    val dateStartProcessingDelivery: String? = null,

    /* Когда клиент получил заказ */
    @SerializedName("dateCustomerReceived")
    val dateCustomerReceived: String? = null,

    /* Дата закрытия заказа. Может быть не закрыт, если нужна еще оплата */
    @SerializedName("dateClose")
    val dateClose: String? = null,

    /* Кто собрал заказ */
    @SerializedName("idEmployyeOrderPicker")
    val idEmployyeOrderPicker: String? = null,

    /* Кто отвез заказ */
    @SerializedName("idEmployyeCourier")
    val idEmployyeCourier: String? = null,

    /* Идентификатор внешений учетной системы, который устанавливается в момент загрузки документа во внешнюю учетную систему */
    @SerializedName("idExternalERP")
    val idExternalERP: String? = null,

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

    @SerializedName("listDRSale")
    val listDRSale: List<DRSaleForCartAndOrder>? = null,

    @SerializedName("listDRComment")
    val listDRComment: List<DRComment>? = null

)

