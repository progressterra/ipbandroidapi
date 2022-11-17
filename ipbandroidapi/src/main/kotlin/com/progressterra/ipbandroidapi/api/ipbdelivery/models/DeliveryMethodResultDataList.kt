package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName
import org.openapitools.client.models.DeliveryMethod

data class DeliveryMethodResultDataList(

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val data: List<DeliveryMethod>? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: Int? = null
)