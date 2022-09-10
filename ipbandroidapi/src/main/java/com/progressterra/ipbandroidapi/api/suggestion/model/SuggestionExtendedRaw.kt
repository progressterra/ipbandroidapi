package com.progressterra.ipbandroidapi.api.suggestion.model

import com.google.gson.annotations.SerializedName

internal data class SuggestionExtendedRaw(
    @SerializedName("area")
    val area: String? = null,
    @SerializedName("area_fias_id")
    val areaFiasId: String? = null,
    @SerializedName("area_kladr_id")
    val areaKladrId: String? = null,
    @SerializedName("block")
    val block: String? = null,
    @SerializedName("city")
    val city: String? = null,
    @SerializedName("city_district")
    val cityDistrict: String? = null,
    @SerializedName("city_district_fias_id")
    val cityDistrictFiasId: String? = null,
    @SerializedName("city_district_kladr_id")
    val cityDistrictKladrId: String? = null,
    @SerializedName("city_fias_id")
    val cityFiasId: String? = null,
    @SerializedName("city_kladr_id")
    val cityKladrId: String? = null,
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("entrance")
    val entrance: String? = null,
    @SerializedName("flat")
    val flat: String? = null,
    @SerializedName("floor")
    val floor: String? = null,
    @SerializedName("geo_lat")
    val geoLat: String? = null,
    @SerializedName("geo_lon")
    val geoLon: String? = null,
    @SerializedName("house")
    val house: String? = null,
    @SerializedName("house_fias_id")
    val houseFiasId: String? = null,
    @SerializedName("house_kladr_id")
    val houseKladrId: String? = null,
    val kladrId: String? = null,
    @SerializedName("postal_code")
    val postalCode: String? = null,
    @SerializedName("region")
    val region: String? = null,
    @SerializedName("region_fias_id")
    val regionFiasId: String? = null,
    @SerializedName("region_iso_code")
    val regionKladrId: String? = null,
    @SerializedName("region_type")
    val regionType: String? = null,
    val street: String? = null,
    @SerializedName("street_fias_id")
    val streetFiasId: String? = null,
    @SerializedName("street_kladr_id")
    val streetKladrId: String? = null
)