package com.progressterra.ipbandroidapi.api.filter.models

enum class ComparisonType(value: String) {
    EQUALS_STRONG("equalsStrong"),
    EQUALS_IGNORE_CASE("equalsIgnoreCase"),
    CONTAINS_STRONG("containsStrong"),
    CONTAINS_IGNORE_CASE("containsIgnoreCase")
}