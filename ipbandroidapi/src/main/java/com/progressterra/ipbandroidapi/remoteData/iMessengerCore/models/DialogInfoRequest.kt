package com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models

class DialogInfoRequest(
    var listId: List<String>,
    var descriptionDialog: String,
    var additionalData: String = "",
    var additionalDataJSON: String
)

data class additionalDataJSON(
    var IDEnterprise: String,
    var URLImage: String
)