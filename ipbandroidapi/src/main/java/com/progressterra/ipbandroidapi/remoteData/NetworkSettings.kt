package com.progressterra.ipbandroidapi.remoteData

internal object NetworkSettings {
    /**
     * Задержка между событиями кнопки выход, мс
     */
    const val EXIT_TIMEOUT = 1000

    /**
     * Время вызова
     */
    const val NETWORK_CALL_TIMEOUT: Long = 20 * 1000

    /**
     * Время подключения
     */
    const val NETWORK_CONNECT_TIMEOUT: Long = 20 * 1000

    /**
     * Время чтения пакета
     */
    const val NETWORK_READ_TIMEOUT: Long = 20 * 1000

    /**
     * Время чтения пакета
     */
    const val NETWORK_WRITE_TIMEOUT: Long = 20 * 1000

    /**
     * Ключ доступа
     */
    var ACCESS_KEY = "5400d184-6753-440d-819c-1034ce7042ed"

    /**
     * Стандартная базовая ссылка (возможно потом поменяем на var)
     */
    const val LIKEDISLIKE_ROOT_URL = "https://mp1.iprobonus.com/"
    const val AMBASSADOR_API_URL = "http://84.201.188.117:5093/"
    const val ADDRESSES_ROOT_URL = "http://84.201.188.117:5021/"
    const val SCRMAPIQWERTY_ROOT_URL = "http://84.201.188.117:5021/"
    const val DADATA_ROOT_URL = "https://suggestions.dadata.ru/"
    const val AMBASSADOR_URL = "http://84.201.188.117:5087/"
    const val AMBASSADOR_INVITE_URL = "http://84.201.188.117:5027/"
    const val IMAGE_DATA_CORE_URL = "http://84.201.188.117:5089/"
    const val DIALOGS_URL = "http://84.201.188.117:5093/"
    const val IPB_PROMOCODE_URL = "http://84.201.188.117:5025/"
    const val IPB_FAVPROMOREC_URL = "http://84.201.188.117:5095/"
    const val IECOMMERS_CORE_URL = "http://84.201.188.117:6023/"
    const val IENTERPRISE_URL = "http://84.201.188.97:5023/"
    const val COLLABORATION_CORE_URL = "http://84.201.188.117:5091/"
    const val SBER_API = "http://84.201.188.117:5099/"
    const val DELIVERY_API = "http://84.201.188.117:1955/"
    const val IMHL_API_URL = "http://84.201.188.117:7001/"
    const val IPB_FILTER_URL = "http://84.201.188.117:5501/"

    /**
     * Доп адреса для IBONUS
     */
    val LIKEDISLIKE_ADDITIONAL_URL = listOf<String>()

    const val SCRM_ROOT_URL = "https://mp1.iprobonus.com"

    /**
     * Доп адреса для SCRM
     */
    val SCRM_ADDITIONAL_URL = listOf<String>()

    /**
     * Использовать новый апи для каталога
     */
    const val DELIVERY_KEY_CDEK = "22fcfd37-36cd-4f2a-983b-1885d6c01ad8"

    /**
     * Использовать новый апи для каталога
     */
    const val DELIVERY_KEY_DPD = "411c31ae-5dfc-11ea-9a76-0200ac100a02"
}

/**
 *  Дефолтный айди
 */
const val DEFAULT_ID = "00000000-0000-0000-0000-000000000000"