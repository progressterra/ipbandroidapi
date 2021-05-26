package com.progressterra.ipbandroidapi.localdata.shared_pref

import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.gsonpref.gsonNullablePref
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientInfo

object UserData : KotprefModel() {
    var accessKey by stringPref("")
    var phoneNumber by stringPref("")
    var clientInfo by gsonNullablePref<ClientInfo>()
}