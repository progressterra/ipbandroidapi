/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.ResultOperation

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param result 
 * @param `data` 
 * @param totalNumberRecords 
 */


data class EmptyResultOperationResultData (

    @SerializedName("result")
    val result: ResultOperation? = null,

    @SerializedName("data")
    val `data`: kotlin.Any? = null,

    @SerializedName("totalNumberRecords")
    val totalNumberRecords: kotlin.Int? = null

)

