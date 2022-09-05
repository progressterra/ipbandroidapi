package com.progressterra.ipbandroidapi.base

object NetworkSettings {

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
    const val ACCESS_KEY = "5400d184-6753-440d-819c-1034ce7042ed"

    /**
     * Использовать новый апи для каталога
     */
    const val DELIVERY_KEY_CDEK = "22fcfd37-36cd-4f2a-983b-1885d6c01ad8"

    /**
     * Использовать новый апи для каталога
     */
    const val DELIVERY_KEY_DPD = "411c31ae-5dfc-11ea-9a76-0200ac100a02"

    /**
     *  Дефолтный айди
     */
    const val DEFAULT_ID = "00000000-0000-0000-0000-000000000000"
}