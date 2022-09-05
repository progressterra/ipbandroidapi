package com.progressterra.ipbandroidapi.api.scrm.model

import com.progressterra.ipbandroidapi.user.ClientInfo
import com.progressterra.ipbandroidapi.user.SexType
import com.progressterra.ipbandroidapi.utils.parseToDate

/**
 * Data model
 */
data class ClientData(
    val idUnique: String,
    val idEnterprise: String,
    val name: String,
    val soname: String,
    val patronymic: String,
    val sex: Int,
    val dateOfBirth: String,
    val dateOfRegister: String,
    val comment: String
) {

    fun toClientInfo(): ClientInfo = ClientInfo(
        idUnique = idUnique,
        sex = convertSex(sex),
        soname = soname,
        name = name,
        patronymic = patronymic,
        dateOfBirth = dateOfBirth.parseToDate(),
        dateOfRegister = dateOfRegister
    )

    private fun convertSex(intSex: Int?): SexType {
        return when (intSex) {
            1 -> SexType.MALE
            2 -> SexType.FEMALE
            else -> SexType.NONE
        }
    }
}
