package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientInfo
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.SexType
import com.progressterra.ipbandroidapi.utils.extentions.parseToDate

data class ClientInfoModel(
    @SerializedName("idUnique")
    val idUnique: String? = "",
    @SerializedName("idEnterprise")
    val idEnterprise: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("soname")
    val soname: String? = "",
    @SerializedName("patronymic")
    val patronymic: String? = "",
    @SerializedName("sex")
    val sex: Int? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String? = "",
    @SerializedName("dateOfRegister")
    val dateOfRegister: String? = "",
    @SerializedName("comment")
    val comment: String? = "",
    @SerializedName("jsonAgileData")
    val jsonAgileData: String? = ""
) {
    fun convertToClientInfo(): ClientInfo = ClientInfo(
        idUnique = idUnique ?: "",
        sex = convertSex(sex),
        soname = soname ?: "",
        name = name ?: "",
        patronymic = patronymic ?: "",
        dateOfBirth = dateOfBirth?.parseToDate(),
        dateOfRegister = dateOfRegister ?: ""
    )

    private fun convertSex(intSex: Int?): SexType {
        return when (intSex) {
            1 -> SexType.MALE
            2 -> SexType.FEMALE
            else -> SexType.NONE
        }
    }
}