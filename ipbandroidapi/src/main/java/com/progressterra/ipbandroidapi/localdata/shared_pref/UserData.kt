package com.progressterra.ipbandroidapi.localdata.shared_pref

import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.gsonpref.gsonPref
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientAdditionalInfo
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientInfo

object UserData : KotprefModel() {
    var registerAccessToken by stringPref("")
    var accessToken by stringPref("")
    var androidId by stringPref("")
    var deviceId by stringPref("")
    var clientExist by booleanPref(false)
    var phone by stringPref("")
    var clientAlreadyCreated by booleanPref(false)
    var clientInfo by gsonPref(ClientInfo(""))
    var clientAdditionalInfo by gsonPref(ClientAdditionalInfo())
    var fcmToken by stringPref("")

    fun clearUser(): Boolean {
        registerAccessToken = ""
        accessToken = ""
        deviceId = ""
        clientExist = false
        phone = ""
        clientAlreadyCreated = false
        clientInfo = ClientInfo("")
        clientAdditionalInfo = ClientAdditionalInfo()
        fcmToken = ""

        return true
    }

    val isPersonalCorrupted: Boolean
        get() =
            clientInfo.name.isBlank()
                    || clientInfo.soname.isBlank()
                    || clientAdditionalInfo.emailGeneral.isBlank()
                    || clientInfo.dateOfBirth == null
}