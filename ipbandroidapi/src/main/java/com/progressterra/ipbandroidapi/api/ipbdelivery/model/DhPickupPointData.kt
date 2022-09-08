package com.progressterra.ipbandroidapi.api.ipbdelivery.model

data class DhPickupPointData(
    val drrdAddress: String,
    val drrdSite: String,
    val drrdWorkHour: String,
    val drrfLatitude: Double,
    val drrfLongitude: Double,
    val drrfPickupPointCode: String,
    val drrfType: String,
    val drrfPaymentAvaliable: Int,
    val drrdDressingRoom: Boolean,
    val drrdCanTake: Boolean,
    val drrdWhereIs: String,
    val drrdMetroStation: String
) {

    constructor(data: DhPickupPointRaw?) : this(
        data?.drrdAddress ?: "",
        data?.drrdSite ?: "",
        data?.drrdWorkHour ?: "",
        data?.drrfLatitude ?: 0.0,
        data?.drrfLongitude ?: 0.0,
        data?.drrfPickupPointCode ?: "",
        data?.drrfType ?: "",
        data?.drrfPaymentAvaliable ?: 0,
        data?.drrdDressingRoom ?: false,
        data?.drrdCanTake ?: false,
        data?.drrdWhereIs ?: "",
        data?.drrdMetroStation ?: ""
    )
}