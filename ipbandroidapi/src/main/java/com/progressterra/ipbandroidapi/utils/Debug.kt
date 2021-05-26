package com.progressterra.ipbandroidapi.utils

import android.util.Log
import java.io.PrintWriter
import java.io.StringWriter

internal object Debug {

    /**
     * Показывать ли дебаг
     */
    var showDebug: Boolean = false

    /**
     * Короткое имя приложения
     */
    var nameApp: String? = null

    /**
     * Показывать id потоков
     */
    var showThread: Boolean = false

    private fun getTag(tag: String): String {
        return if (nameApp != null) {
            "$nameApp [$tag]"
        } else tag
    }

    private fun getText(text: String): String {
        return if (showThread) {
            val threadId = Thread.currentThread().id
            "#" + threadId + ":" + android.os.Process.myTid() + " " + text
        } else text
    }

    /**
     * Переводим стек в строку
     * @param t стектрейс
     * @return строка
     */
    private fun getStackTrace(t: Throwable): String {
        val sw = StringWriter()
        t.printStackTrace(PrintWriter(sw))
        return sw.toString()
    }

    fun printThrowable(throwable: Throwable) {
        if (showDebug) {
            throwable.printStackTrace()
        }
    }

    fun printDebug(`object`: Any, text: String) {
        if (showDebug) {
            Log.d(getTag(`object`.javaClass.simpleName), getText(text))
        }
    }

    fun printWarning(`object`: Any, text: String) {
        if (showDebug) {
            Log.w(getTag(`object`.javaClass.simpleName), getText(text))
        }
    }

    fun printError(`object`: Any, text: String) {
        if (showDebug) {
            Log.e(getTag(`object`.javaClass.simpleName), getText(text))
        }
    }
}