package com.progressterra.ipbandroidapi.api.ambassador.models

data class BankAccountDetailsData(
    val bankName: String,
    val bik: String,
    val correspondentAccount: String,
    val kppBank: String,
    val numberAccount: String,
    val tinOfBank: String,
    val typeName: String,
    val tinOfClient: String
) {

    constructor(data: BankAccountDetailsRaw?) : this(
        data?.bankName ?: "",
        data?.bik ?: "",
        data?.correspondentAccount ?: "",
        data?.kppBank ?: "",
        data?.numberAccount ?: "",
        data?.tinOfBank ?: "",
        data?.typeName ?: "",
        data?.tinOfClient ?: ""
    )
}