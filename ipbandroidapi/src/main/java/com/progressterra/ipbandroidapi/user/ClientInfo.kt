package com.progressterra.ipbandroidapi.user

import java.util.*

data class ClientInfo(
    var idUnique: String,
    var sex: SexType = SexType.NONE,
    var soname: String = "",
    var name: String = "",
    var patronymic: String = "",
    var dateOfBirth: Date? = null,
    var dateOfRegister: String = ""
)
