package com.progressterra.ipbandroidapi.interfaces.client.login.models

import com.progressterra.ipbandroidapi.localdata.shared_pref.models.SexType
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.CitiesListResponse

class PersonalInfo {
    var name: String? = null
        set(value) {
            field = value
            nameIsValid = !field.isNullOrBlank()
        }

    var lastname: String? = null
        set(value) {
            field = value
            lastNameIsValid = !field.isNullOrBlank()
        }

    var email: String? = null
        set(value) {
            field = value
            emailIsValid = !field.isNullOrBlank() && (Regex(".+@.+\\..+")).matches(field ?: "")
        }

    var birthdate: String? = null
        set(value) {
            field = value
            birthDateIsValid = true
        }

    var sexType: SexType? = null
        set(value) {
            field = value
            sexTypeSelected = true
        }

    var patronymic: String? = null

    var city: CitiesListResponse.City? = null
        set(value) {
            field = value
            cityIsValid = field != null
        }

    var nameIsValid = false
    var lastNameIsValid = false
    var emailIsValid = false
    var sexTypeSelected = false
    var birthDateIsValid = false
    var cityIsValid = false


    fun infoIsValid(): Boolean {
        return nameIsValid && lastNameIsValid && emailIsValid && sexTypeSelected && birthDateIsValid && cityIsValid
    }
}