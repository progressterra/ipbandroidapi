package com.progressterra.ipbandroidapi.api.payment.models


import com.google.gson.annotations.SerializedName

/**
 * Статусы результата операции, которые отображаются бизнесу см. ConceptualLogical.md блока Operation
 *
 * Values: IN_PROGRESS,SUCCESS,WITH_ERROR
 */

enum class TypeResultOperationBisinessArea {

    @SerializedName("in_progress")
    IN_PROGRESS,

    @SerializedName("success")
    SUCCESS,

    @SerializedName("withError")
    WITH_ERROR;
}

