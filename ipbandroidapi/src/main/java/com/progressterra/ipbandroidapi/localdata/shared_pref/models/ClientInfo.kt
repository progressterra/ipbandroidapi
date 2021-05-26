package com.progressterra.ipbandroidapi.localdata.shared_pref.models

import com.progressterra.ipbandroidapi.localdata.shared_pref.base.JsonPrefModel
import java.util.*

internal data class ClientInfo(
    var idUnique: String,
    var sex: SexType = SexType.NONE,
    var soname: String = "",
    var name: String = "",
    var patronymic: String = "",
    var dateOfBirth: Date? = null,
    var dateOfRegister: String = ""
) : JsonPrefModel()
