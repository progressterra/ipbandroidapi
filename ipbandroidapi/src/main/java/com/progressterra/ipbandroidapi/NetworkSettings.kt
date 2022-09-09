package com.progressterra.ipbandroidapi

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
     *  Дефолтный айди
     */
    const val DEFAULT_ID = "00000000-0000-0000-0000-000000000000"

    /**
     * Ключ доступа
     */
    var ACCESS_KEY = ""
}