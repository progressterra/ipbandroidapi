package com.progressterra.ipbandroidapi.api.scrm.model

import com.progressterra.ipbandroidapi.ext.toSex
import com.progressterra.ipbandroidapi.ext.orNow
import com.progressterra.ipbandroidapi.ext.parseToDate
import java.util.Date

data class ClientData(
    val idUnique: String = "",
    val idEnterprise: String = "",
    val name: String = "",
    val soname: String = "",
    val patronymic: String = "",
    val sex: SexType = SexType.NONE,
    val dateOfBirth: Date = Date(0L),
    val dateOfRegister: Date = Date(0L),
    val comment: String = ""
) {

    internal constructor(data: ClientRaw) : this(
        data.idUnique,
        data.idEnterprise,
        data.name ?: "",
        data.soname ?: "",
        data.patronymic ?: "",
        data.sex?.toSex() ?: SexType.NONE,
        data.dateOfBirth?.parseToDate().orNow(),
        data.dateOfRegister.parseToDate().orNow(),
        data.comment ?: ""
    )
}
