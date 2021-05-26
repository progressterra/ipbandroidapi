package com.progressterra.ipbandroidapi.localdata.shared_pref.models

import com.progressterra.ipbandroidapi.localdata.shared_pref.base.JsonPrefModel

internal data class ClientAdditionalInfo(
    var additionalInfo: String = "",
    var statusCompletion: Int = -1,
    var emailGeneral: String = "",
    var phoneGeneral: String = ""
) : JsonPrefModel()
