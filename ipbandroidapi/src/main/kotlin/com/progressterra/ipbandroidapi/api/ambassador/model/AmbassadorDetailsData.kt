package com.progressterra.ipbandroidapi.api.ambassador.model

data class AmbassadorDetailsData(
    val bankAccountDetails: BankAccountDetailsData,
    val dateLastUpdate: String,
    val idAmbassadorClient: String,
    val idEnterprise: String,
    val idOfficerConfirmation: String,
    val idUnique: String,
    val jsonDataBankAccountDetails: String,
    val queryStatusWork: Int,
    val statusWork: Int,
    val urlImagePassport: String,
    val urlImageSNILS: String,
    val urlImagesContract: String,
) {

    internal constructor(data: AmbassadorDetailsRaw?) : this(
        BankAccountDetailsData(data?.bankAccountDetails),
        data?.dateLastUpdate ?: "",
        data?.idAmbassadorClient ?: "",
        data?.idEnterprise ?: "",
        data?.idOfficerConfirmation ?: "",
        data?.idUnique ?: "",
        data?.jsonDataBankAccountDetails ?: "",
        data?.queryStatusWork ?: 0,
        data?.statusWork ?: 0,
        data?.urlImagePassport ?: "",
        data?.urlImageSNILS ?: "",
        data?.urlImagesContract ?: "",
    )
}
