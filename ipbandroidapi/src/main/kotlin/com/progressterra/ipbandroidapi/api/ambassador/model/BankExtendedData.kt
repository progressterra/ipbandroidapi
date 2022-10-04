package com.progressterra.ipbandroidapi.api.ambassador.model

data class BankExtendedData(
    val bankAccountDetails: BankAccountDetailsData,
    val dateLastUpdate: String,
    val idAmbassadorClient: String,
    val idEnterprise: String,
    val idOfficerConfirmation: String,
    val idUnique: String,
    val jsonDataBankAccountDetails: String,
    val statusWork: Int
) {

    internal constructor(data: UpdateBankInfoResponse.Data?) : this(
        BankAccountDetailsData(data?.bankAccountDetails),
        data?.dateLastUpdate ?: "",
        data?.idAmbassadorClient ?: "",
        data?.idEnterprise ?: "",
        data?.idOfficerConfirmation ?: "",
        data?.idUnique ?: "",
        data?.jsonDataBankAccountDetails ?: "",
        data?.statusWork ?: 0
    )
}