package com.progressterra.ipbandroidapi.api.ipbAmbassador.models.money_out

import com.google.gson.annotations.SerializedName

data class RemoveBonusesResponse(
    @SerializedName("data")
    val data: RemoveBonusesData
)

data class RemoveBonusesData(
    @SerializedName("amountReceivable")
    val amountReceivable: Int,
    @SerializedName("dateDoc")
    val dateDoc: String,
    @SerializedName("dateConfirmation")
    val dateConfirmation: String,
    @SerializedName("idClientAmbassador")
    val idClientAmbassador: String,
    @SerializedName("idEnterprise")
    val idEnterprise: String,
    @SerializedName("idOfficerConfirmation")
    val idOfficerConfirmation: String,
    @SerializedName("idUnique")
    val idUnique: String,
    @SerializedName("number")
    val number: Int,
    @SerializedName("outType")
    val outType: Int,
    @SerializedName("periodTransactionBegin")
    val periodTransactionBegin: String,
    @SerializedName("periodTransactionEnd")
    val periodTransactionEnd: String,
    @SerializedName("stateWithDigditalSignDoc")
    val stateWithDigditalSignDoc: Int,
    @SerializedName("statusDoc")
    val statusDoc: Int,
    @SerializedName("sum")
    val sum: Int,
    @SerializedName("sumComission")
    val sumComission: Int,
    @SerializedName("sumOut")
    val sumOut: Int,
    @SerializedName("textMessage")
    val textMessage: String,
    @SerializedName("urlImageAct")
    val urlImageAct: String
)