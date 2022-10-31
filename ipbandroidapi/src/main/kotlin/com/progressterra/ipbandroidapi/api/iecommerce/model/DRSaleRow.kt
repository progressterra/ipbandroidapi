package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Строки документа - проданных или возвращенных товаров
 *
 * @param idUnique Уникальный идентификатор
 * @param iddhSaleHead Идентификатор документа к которой относится строка
 * @param iddrSaleForReturn Если это возврат - ссылка на строку продажи
 * @param iddrRetrun Идентификатор устанавливается в документе продажи, чтобы знать, что по этой строке уже был сделан возврат
 * @param idrfNomnclatura Идентификатор номенклатуры внешней учетной системы
 * @param idrgGoodsInventory Идентификатор товара
 * @param idFeature Характеристика товара (новый, уцененный и т.д.)
 * @param barcodeCodeGoods Штрихкод товара, который был отсканирован
 * @param nameGoods Наименование товара
 * @param basePrice Базовая (первоначальаня цена) товара
 * @param idDiscountBasisForBeginPrice Идентификатор скидки на основании которой получена текущая цена (BeginPrice)
 * @param beginPrice Цена товара со скидкой до применения акций и списания бонусов
 * @param endPrice Окончательная цена товара после применения акций и списания бонусов
 * @param priceCost Себестоимость товара на момент продажи
 * @param idSeller Идентификатор сотрудника сделавшего продажу
 * @param indexInCheck Позиция товара в чеке
 * @param saleType ?
 * @param defectName Наименование дефекта товара
 * @param idrfReasonReturn Идентификатор типа причины возврата
 * @param reasonReturnText Причина возврата
 * @param kiz Контрольно идентификационный знак для маркированной продукции
 * @param imageJSONData Данные изображения
 * @param datePickingFirst Дата когда товар был укомплектован в заказе оператором по сбору заказа
 * @param datePickingSecond Дата подтверждения комплектации товара при передаче на доставку
 * @param drAddedBonus Строки начисленных бонусов
 * @param drDiscountPosition Строки примененных скидок к позиции
 * @param drPaymentPositionSale Строки оплат примененных к позиции
 * @param drPaymentRowBonus Строки примененных оплат примененных к позиции
 * @param dhSaleHead
 */

data class DRSaleRow(

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор документа к которой относится строка */
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Если это возврат - ссылка на строку продажи */
    @SerializedName("iddrSaleForReturn")
    val iddrSaleForReturn: String? = null,

    /* Идентификатор устанавливается в документе продажи, чтобы знать, что по этой строке уже был сделан возврат */
    @SerializedName("iddrRetrun")
    val iddrRetrun: String? = null,

    /* Идентификатор номенклатуры внешней учетной системы */
    @SerializedName("idrfNomnclatura")
    val idrfNomnclatura: String? = null,

    /* Идентификатор товара */
    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String? = null,

    /* Характеристика товара (новый, уцененный и т.д.) */
    @SerializedName("idFeature")
    val idFeature: String? = null,

    /* Штрихкод товара, который был отсканирован */
    @SerializedName("barcodeCodeGoods")
    val barcodeCodeGoods: String? = null,

    /* Наименование товара */
    @SerializedName("nameGoods")
    val nameGoods: String? = null,

    /* Базовая (первоначальаня цена) товара */
    @SerializedName("basePrice")
    val basePrice: Double? = null,

    /* Идентификатор скидки на основании которой получена текущая цена (BeginPrice) */
    @SerializedName("idDiscountBasisForBeginPrice")
    val idDiscountBasisForBeginPrice: String? = null,

    /* Цена товара со скидкой до применения акций и списания бонусов */
    @SerializedName("beginPrice")
    val beginPrice: Double? = null,

    /* Окончательная цена товара после применения акций и списания бонусов */
    @SerializedName("endPrice")
    val endPrice: Double? = null,

    /* Себестоимость товара на момент продажи */
    @SerializedName("priceCost")
    val priceCost: Double? = null,

    /* Идентификатор сотрудника сделавшего продажу */
    @SerializedName("idSeller")
    val idSeller: String? = null,

    /* Позиция товара в чеке */
    @SerializedName("indexInCheck")
    val indexInCheck: Int? = null,

    /* ? */
    @SerializedName("saleType")
    val saleType: Int? = null,

    /* Наименование дефекта товара */
    @SerializedName("defectName")
    val defectName: String? = null,

    /* Идентификатор типа причины возврата */
    @SerializedName("idrfReasonReturn")
    val idrfReasonReturn: String? = null,

    /* Причина возврата */
    @SerializedName("reasonReturnText")
    val reasonReturnText: String? = null,

    /* Контрольно идентификационный знак для маркированной продукции */
    @SerializedName("kiz")
    val kiz: String? = null,

    /* Данные изображения */
    @SerializedName("imageJSONData")
    val imageJSONData: String? = null,

    /* Дата когда товар был укомплектован в заказе оператором по сбору заказа */
    @SerializedName("datePickingFirst")
    val datePickingFirst: String? = null,

    /* Дата подтверждения комплектации товара при передаче на доставку */
    @SerializedName("datePickingSecond")
    val datePickingSecond: String? = null,

    /* Строки начисленных бонусов */
    @SerializedName("drAddedBonus")
    val drAddedBonus: List<DRAddedBonus>? = null,

    /* Строки примененных скидок к позиции */
    @SerializedName("drDiscountPosition")
    val drDiscountPosition: List<DRDiscountPosition>? = null,

    /* Строки оплат примененных к позиции */
    @SerializedName("drPaymentPositionSale")
    val drPaymentPositionSale: List<DRPaymentPositionSale>? = null,

    /* Строки примененных оплат примененных к позиции */
    @SerializedName("drPaymentRowBonus")
    val drPaymentRowBonus: List<DRPaymentRowBonus>? = null,

    @SerializedName("dhSaleHead")
    val dhSaleHead: DHSaleHead? = null

)

