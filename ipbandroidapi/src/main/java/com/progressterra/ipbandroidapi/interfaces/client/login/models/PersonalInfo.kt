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
        set(value) {
            field = value
            patronymicIsValid = !field.isNullOrBlank()
        }

    var city: CitiesListResponse.City? = null
        set(value) {
            field = value
            cityIsValid = field != null
        }

    var patronymicIsValid = false
    var nameIsValid = false
    var lastNameIsValid = false
    var emailIsValid = false
    var sexTypeSelected = false
    var birthDateIsValid = false
    var cityIsValid = false


    fun infoIsValid(
        includeName: Boolean,
        includeSurname: Boolean,
        includeSex: Boolean,
        includeBirthDate: Boolean,
        includeCity: Boolean,
        includeEmail: Boolean,
        includePatronymic: Boolean
    ): Boolean {
        return !(
                (nameIsValid xor includeName) &&
                (lastNameIsValid xor includeSurname) &&
                (sexTypeSelected xor includeSex) &&
                (birthDateIsValid xor includeBirthDate) &&
                (cityIsValid xor includeCity) &&
                (patronymicIsValid xor includePatronymic) &&
                (emailIsValid xor includeEmail)
                )
    }
}