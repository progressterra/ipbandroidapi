package com.progressterra.ipbandroidapi.api.scrm.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: SUCCESS,WARNING,ERROR_SERVER,ERROR_AUTH,ERROR_ACCESS
 */

enum class StatusResult(val value: String) {

    @SerializedName("success")
    SUCCESS("success"),

    @SerializedName("warning")
    WARNING("warning"),

    @SerializedName("errorServer")
    ERROR_SERVER("errorServer"),

    @SerializedName("errorAuth")
    ERROR_AUTH("errorAuth"),

    @SerializedName("errorAccess")
    ERROR_ACCESS("errorAccess");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): String? = if (data is StatusResult) "$data" else null

        /**
         * Returns a valid [StatusResult] for [data], null otherwise.
         */
        fun decode(data: Any?): StatusResult? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

