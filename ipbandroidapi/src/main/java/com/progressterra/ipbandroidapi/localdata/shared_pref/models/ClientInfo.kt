package com.progressterra.ipbandroidapi.localdata.shared_pref.models

import java.util.*

data class ClientInfo(
    var idUnique: String,
    var sex: SexType? = SexType.NONE,
    var soname: String? = null,
    var name: String? = null,
    var patronymic: String? = null,
    var dateOfBirth: Date? = null,
    var dateOfRegister: String? = ""
)
