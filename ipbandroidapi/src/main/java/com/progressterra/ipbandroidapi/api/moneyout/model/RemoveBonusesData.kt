package com.progressterra.ipbandroidapi.api.moneyout.model

data class RemoveBonusesData(
    val amountReceivable: Int,
    val dateDoc: String,
    val dateConfirmation: String,
    val idClientAmbassador: String,
    val idEnterprise: String,
    val idOfficerConfirmation: String,
    val idUnique: String,
    val number: Int,
    val outType: Int,
    val periodTransactionBegin: String,
    val periodTransactionEnd: String,
    val stateWithDigditalSignDoc: Int,
    val statusDoc: Int,
    val sum: Int,
    val sumComission: Int,
    val sumOut: Int,
    val textMessage: String,
    val urlImageAct: String
) {

    constructor(data: RemoveBonusesResponse.Data?) : this(
        data?.amountReceivable ?: 0,
        data?.dateDoc ?: "",
        data?.dateConfirmation ?: "",
        data?.idClientAmbassador ?: "",
        data?.idEnterprise ?: "",
        data?.idOfficerConfirmation ?: "",
        data?.idUnique ?: "",
        data?.number ?: 0,
        data?.outType ?: 0,
        data?.periodTransactionBegin ?: "",
        data?.periodTransactionEnd ?: "",
        data?.stateWithDigditalSignDoc ?: 0,
        data?.statusDoc ?: 0,
        data?.sum ?: 0,
        data?.sumComission ?: 0,
        data?.sumOut ?: 0,
        data?.textMessage ?: "",
        data?.urlImageAct ?: ""
    )
}