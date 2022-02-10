package com.progressterra.ipbandroidapi.api.ipbAmbassador

import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.ambassador_status.AmbassadorStatusResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.BankInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateBankInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.cooperation_type.CooperationListResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.direct_payment.AmbassadorDataResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members.AmbassadorInviteDataResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members.InviteByPhoneResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members.InvitingMembersRequest
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import okhttp3.ResponseBody
import retrofit2.Response

/**
 * http://84.201.188.117:5087/docsapi/v1/index.html
 * http://84.201.188.117:5027/docsapi/v1/index.html
 */
interface IPBAmbassador {
    interface Ambassador {
        suspend fun getUserBankData(accessToken: String): BankInfoResponse

        suspend fun updateUserBankData(
            accessToken: String,
            bankName: String,
            numberAccount: String,
            bik: String,
            correspondentAccount: String,
            tinOfBank: String,
            kppBank: String,
            tinOfClient: String
        ): UpdateBankInfoResponse

        suspend fun uploadSnilsPhotoUrl(
            snilsPhotoUrl: String,
            accessToken: String
        ): ResultResponse

        suspend fun uploadPassportPhotoUrl(
            passportPhotoUrl: String,
            accessToken: String
        ): ResultResponse

        suspend fun becomeSelfEmployed(
            accessToken: String
        ): AmbassadorStatusResponse

        suspend fun getAmbassadorStatus(accessToken: String): AmbassadorStatusResponse

        suspend fun getContractOfAmbassador(accessToken: String): Response<ResponseBody>

        suspend fun uploadAmbassadorContractPhotoUrl(
            accessToken: String,
            urlImage: String
        ): ResultResponse

        suspend fun getCooperationTypeList(accessToken: String): CooperationListResponse

        suspend fun setDirectPaymentCooperationType(accessToken: String): AmbassadorDataResponse

        suspend fun setNewNumber(
            accessToken: String,
            phone: String,
            verifiedChannelCode: String
        ): AmbassadorDataResponse
    }

    interface AmbassadorInvite {
        /**
         * получить текст и персональный код приглашения для отправки контактам
         */
        suspend fun getInviteInfo(accessToken: String): AmbassadorInviteDataResponse

        /**
         * отправить приглашение на список номеров телефонов для вступления в программу лояльности
         */
        suspend fun sendInvites(invitingMembersRequest: InvitingMembersRequest): InviteByPhoneResponse
    }

    interface MoneyOut

    interface Product

    interface SaleFix

    companion object {
        fun Ambassador(): Ambassador = IPBAmbassadorImpl()
        fun AmbassadorInvite(): AmbassadorInvite = IPBAmbassadorImpl()
    }
}