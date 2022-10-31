package com.progressterra.ipbandroidapi.api.iecommerce.model


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique Уникальный идентификатор
 * @param name Наименование товара
 * @param extendedDescription Расширенное описание товара
 * @param artikul Артикул
 * @param idEnterprise Организация, которой принадлежит товар
 * @param url URL страницы товара на сайте
 * @param imageDataJSON Гибкая модель изображений товаров
 * @param additionalDataJSON Гибкая модель дополнительных данных товара
 * @param idCategory Идентификатор категории каталога, в которой находится тоовар
 * @param popularOrder Порядок вывода товара по популярности
 * @param rating Рейтинг товаара
 * @param barcode Штрихкоды (может быть множество штрихкодов через точку с запятой)
 * @param idDiscountBasisForBeginPrice Идентификатор скидки на основании которой получена текущая цена (BeginPrice)
 * @param idFeature Характеристика товара (новый, уцененный и т.д.)
 * @param nameFeature Наименование характеристики товава
 * @param defectName Наименование дефекта товара
 * @param kiz Контрольно идентификационный знак
 * @param additionaInfo
 * @param lastTimeUpdate Дата последнего обновления сущности
 * @param idrfNomenclatura Идентификатор номенклатуры товара
 * @param idrfShop Идентификтор магазина, в котором находится товар
 * @param quantity Количество товара
 * @param beginPrice Первоначальная цена товара
 * @param currentPrice Цена с учетом скидок
 * @param costPrice Себестоимость конкретной данной единицы измерения
 * @param costtPriceBasicUnit Себестоиомсть базовой единицы измерения
 * @param maxValueDiscount Максимальная скидка, которая может быть сделана               На основе данного параметра и текущей скидки можно вычислить какую скидку можно еще сделать, например, бонусами
 * @param idrfPlace Идентификатор места хранения данного товара
 * @param colorName Наименование цвета номенклатуры Устанавливает из номенклатуры
 * @param idrfColor Идентификатор цвета
 * @param countInCart
 */

data class RGGoodsInventoryExt(

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Наименование товара */
    @SerializedName("name")
    val name: String? = null,

    /* Расширенное описание товара */
    @SerializedName("extendedDescription")
    val extendedDescription: String? = null,

    /* Артикул */
    @SerializedName("artikul")
    val artikul: String? = null,

    /* Организация, которой принадлежит товар */
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    /* URL страницы товара на сайте */
    @SerializedName("url")
    val url: String? = null,

    /* Гибкая модель изображений товаров */
    @SerializedName("imageDataJSON")
    val imageDataJSON: String? = null,

    /* Гибкая модель дополнительных данных товара */
    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String? = null,

    /* Идентификатор категории каталога, в которой находится тоовар */
    @SerializedName("idCategory")
    val idCategory: String? = null,

    /* Порядок вывода товара по популярности */
    @SerializedName("popularOrder")
    val popularOrder: Int? = null,

    /* Рейтинг товаара */
    @SerializedName("rating")
    val rating: Float? = null,

    /* Штрихкоды (может быть множество штрихкодов через точку с запятой) */
    @SerializedName("barcode")
    val barcode: String? = null,

    /* Идентификатор скидки на основании которой получена текущая цена (BeginPrice) */
    @SerializedName("idDiscountBasisForBeginPrice")
    val idDiscountBasisForBeginPrice: String? = null,

    /* Характеристика товара (новый, уцененный и т.д.) */
    @SerializedName("idFeature")
    val idFeature: String? = null,

    /* Наименование характеристики товава */
    @SerializedName("nameFeature")
    val nameFeature: String? = null,

    /* Наименование дефекта товара */
    @SerializedName("defectName")
    val defectName: String? = null,

    /* Контрольно идентификационный знак */
    @SerializedName("kiz")
    val kiz: String? = null,

    @SerializedName("additionaInfo")
    val additionaInfo: String? = null,

    /* Дата последнего обновления сущности */
    @SerializedName("lastTimeUpdate")
    val lastTimeUpdate: String? = null,

    /* Идентификатор номенклатуры товара */
    @SerializedName("idrfNomenclatura")
    val idrfNomenclatura: String? = null,

    /* Идентификтор магазина, в котором находится товар */
    @SerializedName("idrfShop")
    val idrfShop: String? = null,

    /* Количество товара */
    @SerializedName("quantity")
    val quantity: Int? = null,

    /* Первоначальная цена товара */
    @SerializedName("beginPrice")
    val beginPrice: Double? = null,

    /* Цена с учетом скидок */
    @SerializedName("currentPrice")
    val currentPrice: Double? = null,

    /* Себестоимость конкретной данной единицы измерения */
    @SerializedName("costPrice")
    val costPrice: Double? = null,

    /* Себестоиомсть базовой единицы измерения */
    @SerializedName("costtPriceBasicUnit")
    val costtPriceBasicUnit: Double? = null,

    /* Максимальная скидка, которая может быть сделана               На основе данного параметра и текущей скидки можно вычислить какую скидку можно еще сделать, например, бонусами */
    @SerializedName("maxValueDiscount")
    val maxValueDiscount: Double? = null,

    /* Идентификатор места хранения данного товара */
    @SerializedName("idrfPlace")
    val idrfPlace: String? = null,

    /* Наименование цвета номенклатуры Устанавливает из номенклатуры */
    @SerializedName("colorName")
    val colorName: String? = null,

    /* Идентификатор цвета */
    @SerializedName("idrfColor")
    val idrfColor: String? = null,

    @SerializedName("countInCart")
    val countInCart: Int? = null

)

