package com.progressterra.ipbandroidapi.user

import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.gsonpref.gsonPref
import com.progressterra.ipbandroidapi.api.scrm.model.ClientAdditionalData
import com.progressterra.ipbandroidapi.api.scrm.model.ClientData

object UserData : KotprefModel() {

    var registerAccessToken by stringPref("")
    var accessToken by stringPref("")
    var androidId by stringPref("")
    var deviceId by stringPref("")
    var clientExist by booleanPref(false)
    var phone by stringPref("")
    var clientAlreadyCreated by booleanPref(false)
    var clientInfo by gsonPref(ClientData())
    var clientAdditionalInfo by gsonPref(ClientAdditionalData())
    var fcmToken by stringPref("")

    fun clearUser(): Boolean {
        registerAccessToken = ""
        accessToken = ""
        deviceId = ""
        clientExist = false
        phone = ""
        clientAlreadyCreated = false
        clientInfo = ClientData()
        clientAdditionalInfo = ClientAdditionalData()
        fcmToken = ""
        return true
    }
}