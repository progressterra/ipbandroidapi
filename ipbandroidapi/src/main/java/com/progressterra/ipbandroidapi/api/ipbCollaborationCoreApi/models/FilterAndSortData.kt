package com.progressterra.ipbandroidapi.api.ipbCollaborationCoreApi.models

import com.google.gson.annotations.SerializedName

internal data class FilterAndSortData(
    @SerializedName("maxDistance")
    val maxDistance: Int = 0,
    @SerializedName("idMainCategory")
    val idMainCategory: String = "",
    @SerializedName("listIDCitiesString")
    val listIDCitiesString: String = "",
    @SerializedName("listIDCCategoryString")
    val listIDCCategoryString: String = "",
    @SerializedName("validPromotions")
    val validPromotions: Boolean = false,
    @SerializedName("ofline")
    val offline: Boolean = false,
    @SerializedName("online")
    val online: Boolean = false,
    @SerializedName("forOwn")
    val forOwn: Boolean = false,
    @SerializedName("delivery")
    val delivery: Boolean = false,
    @SerializedName("enrollBonuses")
    val enrollBonuses: Boolean = false,
    @SerializedName("acceptBonuses")
    val acceptBonuses: Boolean = false,
    @SerializedName("sort")
    val sort: Int = 0,
    @SerializedName("minPrice")
    val minPrice: Double = 0.0,
    @SerializedName("maxPrice")
    val maxPrice: Double = 0.0,
    @SerializedName("searchString")
    val searchString: String = "",
    @SerializedName("sortOrder")
    val sortOrder: Int = 0
)

data class FilterAndSortRequest(
    val maxDistance: Int = 0,
    val idMainCategory: String = "",
    val listIDCitiesString: String = "",
    val listIDCCategoryString: String = "",
    val validPromotions: Boolean = false,
    val offline: Boolean = false,
    val online: Boolean = false,
    val forOwn: Boolean = false,
    val delivery: Boolean = false,
    val enrollBonuses: Boolean = false,
    val acceptBonuses: Boolean = false,
    val sort: SortType = SortType.POPULAR,
    val minPrice: Double = 0.0,
    val maxPrice: Double = 0.0,
    val searchString: String = "",
    val sortOrder: SortOrder = SortOrder.ASCENDING
) {
    internal fun convert(): FilterAndSortData =
        FilterAndSortData(
            maxDistance = maxDistance,
            idMainCategory = idMainCategory,
            listIDCitiesString = listIDCitiesString,
            listIDCCategoryString = listIDCCategoryString,
            validPromotions = validPromotions,
            offline = offline,
            online = online,
            forOwn = forOwn,
            delivery = delivery,
            enrollBonuses = enrollBonuses,
            acceptBonuses = acceptBonuses,
            sort = sort.value,
            minPrice = minPrice,
            maxPrice = maxPrice,
            searchString = searchString,
            sortOrder = sortOrder.value
        )
}

enum class SortType(val value: Int) {
    POPULAR(0),
    DISTANCE(1),
    ALPHABETICALLY(2),
    BY_SUM_DISCOUNT(3)
}

enum class SortOrder(val value: Int) {
    ASCENDING(0),
    DESCENDING(1)
}