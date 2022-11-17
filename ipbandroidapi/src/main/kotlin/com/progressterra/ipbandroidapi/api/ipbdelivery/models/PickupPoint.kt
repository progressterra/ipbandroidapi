package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 * Пункт выдачи заказов
 *
 * @param drrfPickupPointCode Название пункта выдачи
 * @param drrdAddress Физический адресс пункта
 * @param drrfLatitude Геграфическая ширина
 * @param drrfLongitude Геграфическая долгота
 * @param drrdWorkHour Часы работы
 * @param drrdSite Страница ПВЗ на сайте службы доставки
 * @param drrfType Тип ПВЗ
 * @param drrfPaymentAvaliable
 * @param drrdDressingRoom Возможность примерки.
 * @param drrdCanTake Возможность отправки.
 * @param drrdWhereIs Описание расположения.
 * @param drrdMetroStation Ближайшая станция метро.
 */
data class PickupPoint(

    /* Название пункта выдачи */
    @SerializedName("drrfPickupPointCode")
    val drrfPickupPointCode: String? = null,

    /* Физический адресс пункта */
    @SerializedName("drrdAddress")
    val drrdAddress: String? = null,

    /* Геграфическая ширина */
    @SerializedName("drrfLatitude")
    val drrfLatitude: Double? = null,

    /* Геграфическая долгота */
    @SerializedName("drrfLongitude")
    val drrfLongitude: Double? = null,

    /* Часы работы */
    @SerializedName("drrdWorkHour")
    val drrdWorkHour: String? = null,

    /* Страница ПВЗ на сайте службы доставки */
    @SerializedName("drrdSite")
    val drrdSite: String? = null,

    /* Тип ПВЗ */
    @SerializedName("drrfType")
    val drrfType: String? = null,

    @SerializedName("drrfPaymentAvaliable")
    val drrfPaymentAvaliable: PaymentTypeEnum? = null,

    /* Возможность примерки. */
    @SerializedName("drrdDressingRoom")
    val drrdDressingRoom: Boolean? = null,

    /* Возможность отправки. */
    @SerializedName("drrdCanTake")
    val drrdCanTake: Boolean? = null,

    /* Описание расположения. */
    @SerializedName("drrdWhereIs")
    val drrdWhereIs: String? = null,

    /* Ближайшая станция метро. */
    @SerializedName("drrdMetroStation")
    val drrdMetroStation: String? = null
)