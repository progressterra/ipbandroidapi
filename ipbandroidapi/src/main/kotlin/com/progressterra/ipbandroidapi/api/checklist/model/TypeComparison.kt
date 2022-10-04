package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * Values: EQUALS_STRONG,EQUALS_IGNORE_CASE,CONTAINS_STRONG,CONTAINS_IGNORE_CASE
 */
@Suppress("unused")
enum class TypeComparison(val value: String) {
    EQUALS_STRONG("equalsStrong"), EQUALS_IGNORE_CASE("equalsIgnoreCase"), CONTAINS_STRONG("containsStrong"), CONTAINS_IGNORE_CASE(
        "containsIgnoreCase"
    )
}