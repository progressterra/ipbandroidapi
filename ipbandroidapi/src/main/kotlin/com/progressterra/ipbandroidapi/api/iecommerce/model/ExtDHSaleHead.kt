package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique Уникальный идентификатор документа
 * @param idEnterprise Идентификатор организации
 * @param idExternalERP Идентификатор внешений учетной системы, который устанавливается в момент загрузки документа во внешнюю учетную систему
 * @param dateDoc Дата документа
 * @param number Номер документа
 * @param numberInt Автоинкрементируемый номер документа
 * @param fDocumentNumber Номер документа полученный из кассы
 * @param adressString Адрес доставки в виде строкового описания
 * @param idExtDataAddress Идентификатор объекта адреса из внешней системы
 * @param commentClient Комментарий клиента
 * @param posted Дата окончального проведения документа. Если она есть - можем отправлять на сервер \\  Устанавливается когда распечатали документ на ККМ
 * @param idPreSale Идентификатор заказа из интернет магазина или мобильного приложения, на основании которого производим выдачу товара
 * @param currentPositionInCashCahnge Номер чека в текущей кассовой смене
 * @param typeSaleReturn
 * @param idrfShop Идентификатор магазина в котороом сделана продажа
 * @param idrgCashChange Идентификатор кассовой смены в который была проведена продажа
 * @param idrfCashier Идентификатор кассира от имени которого прошла продажа
 * @param idBayer Идентификатор клиента
 * @param beginTimeService Время открытия документа
 * @param endTimeService Время закрытия документа
 * @param mode Режим документа Используется для работы iCS c онлайн заказами
 * @param statusOrder
 * @param statusObject Статус документа 1 - документ проведен. Для выгрузки во внешнюю систему передаются документы со значение 1
 * @param postedAddBonuses Дата расчета добавления бонусов
 * @param postedWritingBonuses Дата расчета списания бонусов
 * @param dateSync Дата синхронизации с сервером iCS
 * @param dateSyncWithExternalERP Дата синхронизации клиента, с внешней учетной системой
 * @param indexCount Номер документа в текущий кассовой смене
 * @param fiscalCheckNumber Фискальный номер документа
 * @param dateToSend Дата отправки заказа как запланировано
 * @param dateConfirm Дата подтверждения заказа оператором
 * @param dateCollection Дата сбора заказа
 * @param dateTranssferToSend Дата передачи заказа в службу доставки
 * @param dateStartProcessingDelivery Дата начала доставки именно данного заказа
 * @param dateCustomerReceived Когда клиент получил заказ
 * @param dateClose Дата закрытия заказа. Может быть не закрыт, если нужна еще оплата
 * @param levelOfSatisfaction
 * @param reasonLevelOfSatisfaction
 * @param systemLevelOfSatisfaction
 * @param idEmployyeOrderPicker Кто собрал заказ
 * @param idEmployyeCourier Кто отвез заказ
 * @param fiscalCheckFN Кассовые атрибуты
 * @param fiscalCheckFD
 * @param fiscalCheckFP
 * @param drDiscountSaleHead Строки скидок для всего документаа
 * @param drGiftCardPayment Строки оплат сертификатом
 * @param drPaymentSaleHead Строки оплат всего документа
 * @param drSaleRow Строки товаров документа
 * @param drMetaDHSaleHead Дополнительные метаданные
 * @param drComment Комментарии к продаже
 * @param adAvailablePaymentBonus
 * @param clientData
 */

data class ExtDHSaleHead(

    /* Уникальный идентификатор документа */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор организации */
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    /* Идентификатор внешений учетной системы, который устанавливается в момент загрузки документа во внешнюю учетную систему */
    @SerializedName("idExternalERP")
    val idExternalERP: String? = null,

    /* Дата документа */
    @SerializedName("dateDoc")
    val dateDoc: String? = null,

    /* Номер документа */
    @SerializedName("number")
    val number: String? = null,

    /* Автоинкрементируемый номер документа */
    @SerializedName("numberInt")
    val numberInt: Int? = null,

    /* Номер документа полученный из кассы */
    @SerializedName("fDocumentNumber")
    val fDocumentNumber: Int? = null,

    /* Адрес доставки в виде строкового описания */
    @SerializedName("adressString")
    val adressString: String? = null,

    /* Идентификатор объекта адреса из внешней системы */
    @SerializedName("idExtDataAddress")
    val idExtDataAddress: String? = null,

    /* Комментарий клиента */
    @SerializedName("commentClient")
    val commentClient: String? = null,

    /* Дата окончального проведения документа. Если она есть - можем отправлять на сервер \\  Устанавливается когда распечатали документ на ККМ */
    @SerializedName("posted")
    val posted: String? = null,

    /* Идентификатор заказа из интернет магазина или мобильного приложения, на основании которого производим выдачу товара */
    @SerializedName("idPreSale")
    val idPreSale: String? = null,

    /* Номер чека в текущей кассовой смене */
    @SerializedName("currentPositionInCashCahnge")
    val currentPositionInCashCahnge: Long? = null,

    @SerializedName("typeSaleReturn")
    val typeSaleReturn: Int? = null,

    /* Идентификатор магазина в котороом сделана продажа */
    @SerializedName("idrfShop")
    val idrfShop: String? = null,

    /* Идентификатор кассовой смены в который была проведена продажа */
    @SerializedName("idrgCashChange")
    val idrgCashChange: String? = null,

    /* Идентификатор кассира от имени которого прошла продажа */
    @SerializedName("idrfCashier")
    val idrfCashier: String? = null,

    /* Идентификатор клиента */
    @SerializedName("idBayer")
    val idBayer: String? = null,

    /* Время открытия документа */
    @SerializedName("beginTimeService")
    val beginTimeService: String? = null,

    /* Время закрытия документа */
    @SerializedName("endTimeService")
    val endTimeService: String? = null,

    /* Режим документа Используется для работы iCS c онлайн заказами */
    @SerializedName("mode")
    val mode: Int? = null,

    @SerializedName("statusOrder")
    val statusOrder: Int? = null,

    /* Статус документа 1 - документ проведен. Для выгрузки во внешнюю систему передаются документы со значение 1 */
    @SerializedName("statusObject")
    val statusObject: Int? = null,

    /* Дата расчета добавления бонусов */
    @SerializedName("postedAddBonuses")
    val postedAddBonuses: String? = null,

    /* Дата расчета списания бонусов */
    @SerializedName("postedWritingBonuses")
    val postedWritingBonuses: String? = null,

    /* Дата синхронизации с сервером iCS */
    @SerializedName("dateSync")
    val dateSync: String? = null,

    /* Дата синхронизации клиента, с внешней учетной системой */
    @SerializedName("dateSyncWithExternalERP")
    val dateSyncWithExternalERP: String? = null,

    /* Номер документа в текущий кассовой смене */
    @SerializedName("indexCount")
    val indexCount: Int? = null,

    /* Фискальный номер документа */
    @SerializedName("fiscalCheckNumber")
    val fiscalCheckNumber: Int? = null,

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

    @SerializedName("levelOfSatisfaction")
    val levelOfSatisfaction: Int? = null,

    @SerializedName("reasonLevelOfSatisfaction")
    val reasonLevelOfSatisfaction: String? = null,

    @SerializedName("systemLevelOfSatisfaction")
    val systemLevelOfSatisfaction: Int? = null,

    /* Кто собрал заказ */
    @SerializedName("idEmployyeOrderPicker")
    val idEmployyeOrderPicker: String? = null,

    /* Кто отвез заказ */
    @SerializedName("idEmployyeCourier")
    val idEmployyeCourier: String? = null,

    /* Кассовые атрибуты */
    @SerializedName("fiscalCheckFN")
    val fiscalCheckFN: String? = null,

    @SerializedName("fiscalCheckFD")
    val fiscalCheckFD: String? = null,

    @SerializedName("fiscalCheckFP")
    val fiscalCheckFP: String? = null,

    /* Строки скидок для всего документаа */
    @SerializedName("drDiscountSaleHead")
    val drDiscountSaleHead: List<DRDiscountSaleHead>? = null,

    /* Строки оплат сертификатом */
    @SerializedName("drGiftCardPayment")
    val drGiftCardPayment: List<DRGiftCardPayment>? = null,

    /* Строки оплат всего документа */
    @SerializedName("drPaymentSaleHead")
    val drPaymentSaleHead: List<DRPaymentSaleHead>? = null,

    /* Строки товаров документа */
    @SerializedName("drSaleRow")
    val drSaleRow: List<DRSaleRow>? = null,

    /* Дополнительные метаданные */
    @SerializedName("drMetaDHSaleHead")
    val drMetaDHSaleHead: List<DRMetaDHSaleHead>? = null,

    /* Комментарии к продаже */
    @SerializedName("drComment")
    val drComment: List<DRComment>? = null,

    @SerializedName("adAvailablePaymentBonus")
    val adAvailablePaymentBonus: Double? = null,

    @SerializedName("clientData")
    val clientData: ClientInfo? = null

)

