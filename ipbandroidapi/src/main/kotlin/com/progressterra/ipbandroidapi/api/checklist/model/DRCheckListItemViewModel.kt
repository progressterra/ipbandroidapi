package com.progressterra.ipbandroidapi.api.checklist.model

data class DRCheckListItemViewModel(
    val idRegistrar: String?,
    val iddrCheckListItemEntityTemplate: String?,
    val idrfTestParameters: String?,
    val description: String?,
    val shortDescription: String?,
    val needPhoto: Boolean?,
    val needVideo: Boolean?,
    val needComments: Boolean?,
    val needDecimalSpecificMeaning: Boolean?,
    val needSpecificFreeMeaning: Boolean?,
    val idUnique: String?,
    val idEnterprise: String?,
    val dateAdded: String?,
    val dateUpdated: String?,
    val dateSoftRemoved: String?,
    val parameter: RFTestParameters?
)
