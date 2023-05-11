package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param listInfoImage
 */
data class ListInfoImage(

    @SerializedName("listInfoImage") val listInfoImage: List<InfoImage>? = null
)
