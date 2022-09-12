package com.progressterra.ipbandroidapi.api.suggestion.model

import com.google.gson.annotations.SerializedName

internal data class SuggestionExtendedRaw(
    @SerializedName("area")
    val area: String?,
    @SerializedName("area_fias_id")
    val areaFiasId: String?,
    @SerializedName("area_kladr_id")
    val areaKladrId: String?,
    @SerializedName("block")
    val block: String?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("city_district")
    val cityDistrict: String?,
    @SerializedName("city_district_fias_id")
    val cityDistrictFiasId: String?,
    @SerializedName("city_district_kladr_id")
    val cityDistrictKladrId: String?,
    @SerializedName("city_fias_id")
    val cityFiasId: String?,
    @SerializedName("city_kladr_id")
    val cityKladrId: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("entrance")
    val entrance: String?,
    @SerializedName("flat")
    val flat: String?,
    @SerializedName("floor")
    val floor: String?,
    @SerializedName("geo_lat")
    val geoLat: String?,
    @SerializedName("geo_lon")
    val geoLon: String?,
    @SerializedName("house")
    val house: String?,
    @SerializedName("house_fias_id")
    val houseFiasId: String?,
    @SerializedName("house_kladr_id")
    val houseKladrId: String?,
    val kladrId: String?,
    @SerializedName("postal_code")
    val postalCode: String?,
    @SerializedName("region")
    val region: String?,
    @SerializedName("region_fias_id")
    val regionFiasId: String?,
    @SerializedName("region_iso_code")
    val regionKladrId: String?,
    @SerializedName("region_type")
    val regionType: String?,
    val street: String?,
    @SerializedName("street_fias_id")
    val streetFiasId: String?,
    @SerializedName("street_kladr_id")
    val streetKladrId: String?
)