package com.progressterra.ipbandroidapi.api.cart.models


import com.google.gson.annotations.SerializedName

/**
 * Строки корзины или заказа  Отличается от обычных строк, тем, что аргрегирует данные по номенклатуре и рассрочке  Суммирует данные по бонусам, скидкам и начисленным бонусам
 *
 * @param iddhSaleHead Идентификатор документа, которому принадлежит строка
 * @param nameGoods Наименование товара
 * @param idrfNomenclature Идентификатор номенклатуры
 * @param numberInstallmentMonths Количество месяцев рассрочки
 * @param quantity Количество товаров
 * @param amountBasePrice Сумма изначальной цены
 * @param amountBeginPrice Сумма цен до применения скидок и бонусов
 * @param amountEndPrice Сумма конечных цен
 * @param amountDiscount Сумма скидок (без скидок бонусами)
 * @param amountBonusDiscount Сумма скидки бонусами (примененные бонусы)
 * @param amountBonusAdded Начисленные бонусы
 */


data class DRSaleForCartAndOrder (

    /* Идентификатор документа, которому принадлежит строка */
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    /* Наименование товара */
    @SerializedName("nameGoods")
    val nameGoods: String? = null,

    /* Идентификатор номенклатуры */
    @SerializedName("idrfNomenclature")
    val idrfNomenclature: String? = null,

    /* Количество месяцев рассрочки */
    @SerializedName("numberInstallmentMonths")
    val numberInstallmentMonths: Int? = null,

    /* Количество товаров */
    @SerializedName("quantity")
    val quantity: Int? = null,

    /* Сумма изначальной цены */
    @SerializedName("amountBasePrice")
    val amountBasePrice: Double? = null,

    /* Сумма цен до применения скидок и бонусов */
    @SerializedName("amountBeginPrice")
    val amountBeginPrice: Double? = null,

    /* Сумма конечных цен */
    @SerializedName("amountEndPrice")
    val amountEndPrice: Double? = null,

    /* Сумма скидок (без скидок бонусами) */
    @SerializedName("amountDiscount")
    val amountDiscount: Double? = null,

    /* Сумма скидки бонусами (примененные бонусы) */
    @SerializedName("amountBonusDiscount")
    val amountBonusDiscount: Double? = null,

    /* Начисленные бонусы */
    @SerializedName("amountBonusAdded")
    val amountBonusAdded: Double? = null

)

