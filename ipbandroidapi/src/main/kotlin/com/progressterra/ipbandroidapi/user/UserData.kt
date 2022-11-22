package com.progressterra.ipbandroidapi.user

import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.enumpref.enumOrdinalPref
import com.chibatching.kotpref.gsonpref.gsonPref
import com.progressterra.ipbandroidapi.api.scrm.model.SexType

@Suppress("unused")
object UserData : KotprefModel() {

    var deviceId by stringPref()
    var clientExist by booleanPref()
    var phone by stringPref()
    var email by stringPref()
    var address by stringPref()
    var userName by gsonPref(UserName())
    var dateOfBirthday by longPref()

    fun clearUser() {
        deviceId = ""
        clientExist = false
        phone = ""
        email = ""
        userName = UserName()
        dateOfBirthday = 0L
    }
}