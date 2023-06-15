package com.progressterra.ipbandroidapi.api.catalog.models


import com.google.gson.annotations.SerializedName

/**
 * Отображать каталог или не отображать. Например, не отображаться могут каталоги, в которых нет товаров
 *
 * Values: displaying,notDisplaying
 */

enum class TypeDisplayCategoryCatalog {

    @SerializedName("displaying")
    DISPLAYING,

    @SerializedName("notDisplaying")
    NOT_DISPLAYING
}
