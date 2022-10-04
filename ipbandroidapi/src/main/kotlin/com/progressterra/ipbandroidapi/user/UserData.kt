package com.progressterra.ipbandroidapi.user

import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.gsonpref.gsonPref
import com.progressterra.ipbandroidapi.api.scrm.model.ClientAdditionalData
import com.progressterra.ipbandroidapi.api.scrm.model.ClientData

@Suppress("unused")
object UserData : KotprefModel() {

    var deviceId by stringPref("")
    var clientExist by booleanPref(false)
    var phone by stringPref("")
    var clientInfo by gsonPref(ClientData())
    var clientAdditionalInfo by gsonPref(ClientAdditionalData())

    fun clearUser() {
        deviceId = ""
        clientExist = false
        phone = ""
        clientInfo = ClientData()
        clientAdditionalInfo = ClientAdditionalData()
    }
}