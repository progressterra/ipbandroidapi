package com.progressterra.ipbandroidapi.api.ipbambassador

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.ipbambassador.models.ambassador_status.AmbassadorStatusResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.client_info.BankInfoResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.client_info.UpdateBankDataRequest
import com.progressterra.ipbandroidapi.api.ipbambassador.models.client_info.UpdateBankInfoResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.cooperation_type.CooperationListResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.direct_payment.AmbassadorDataResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.direct_payment.SetNewPhoneRequest
import com.progressterra.ipbandroidapi.api.ipbambassador.models.invite_members.AmbassadorInviteDataResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.invite_members.InviteByPhoneResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.invite_members.InvitingMembersRequest
import com.progressterra.ipbandroidapi.api.ipbambassador.models.money_out.RemoveBonusesRequest
import com.progressterra.ipbandroidapi.api.ipbambassador.models.money_out.RemoveBonusesResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.money_out.applications.ApplicationsResponse
import com.progressterra.ipbandroidapi.api.ipbambassador.models.upload_file.UploadContractOfAmbassadorRequest
import com.progressterra.ipbandroidapi.api.ipbambassador.models.upload_file.UploadImageUrlRequest
import com.progressterra.ipbandroidapi.base.ResultResponse
import com.progressterra.ipbandroidapi.core.NetworkService
import okhttp3.ResponseBody
import retrofit2.Response

internal class IPBAmbassadorImpl : IPBAmbassador.Ambassador, IPBAmbassador.AmbassadorInvite {

    private val networkService: NetworkService = NetworkService.Base()
    private val ipbAmbassadorApi =
        networkService.createService(
            IPBAmbassadorApi.Ambassador::class.java,
            URL.AMBASSADOR_URL
        )

    private val ipbAmbassadorInviteApi =
        networkService.createService(
            IPBAmbassadorApi.AmbassadorInvite::class.java,
            URL.AMBASSADOR_INVITE_URL
        )


    override suspend fun getUserBankData(accessToken: String): BankInfoResponse {
        return ipbAmbassadorApi.getUserBankInfo(accessToken)
    }

    override suspend fun updateUserBankData(
        accessToken: String,
        bankName: String,
        numberAccount: String,
        bik: String,
        correspondentAccount: String,
        tinOfBank: String,
        kppBank: String,
        tinOfClient: String
    ): UpdateBankInfoResponse {
        return ipbAmbassadorApi.updateBankClientInfo(
            UpdateBankDataRequest(
                bankName = bankName,
                numberAccount = numberAccount,
                bik = bik,
                correspondentAccount = correspondentAccount,
                tinOfBank = tinOfBank,
                kppBank = kppBank,
                tinOfClient = tinOfClient
            ), accessToken
        )
    }

    override suspend fun uploadSnilsPhotoUrl(
        snilsPhotoUrl: String,
        accessToken: String
    ): ResultResponse {
        return ipbAmbassadorApi.uploadSnilsPhotoUrl(
            accessToken,
            UploadImageUrlRequest(snilsPhotoUrl)
        )
    }

    override suspend fun uploadPassportPhotoUrl(
        passportPhotoUrl: String,
        accessToken: String
    ): ResultResponse {
        return ipbAmbassadorApi.uploadPassportPhotoUrl(
            accessToken,
            UploadImageUrlRequest(passportPhotoUrl)
        )
    }

    override suspend fun becomeSelfEmployed(accessToken: String): AmbassadorStatusResponse {
        return ipbAmbassadorApi.becomeSelfEmployed(accessToken)
    }

    override suspend fun getAmbassadorStatus(accessToken: String): AmbassadorStatusResponse {
        return ipbAmbassadorApi.getAmbassadorStatus(accessToken)
    }

    override suspend fun getContractOfAmbassador(accessToken: String): Response<ResponseBody> {
        return ipbAmbassadorApi.getContractOfAmbassador(accessToken)
    }

    override suspend fun uploadAmbassadorContractPhotoUrl(
        accessToken: String,
        urlImage: String
    ): ResultResponse {
        return ipbAmbassadorApi.uploadAmbassadorContractPhotoUrl(
            UploadContractOfAmbassadorRequest(
                accessToken,
                urlImage
            )
        )
    }

    override suspend fun getCooperationTypeList(accessToken: String): CooperationListResponse {
        return ipbAmbassadorApi.getCooperationTypeList(accessToken)
    }

    override suspend fun setDirectPaymentCooperationType(accessToken: String): AmbassadorDataResponse {
        return ipbAmbassadorApi.setDirectPaymentCooperationType(accessToken)
    }

    override suspend fun setNewNumber(
        accessToken: String,
        phone: String,
        verifiedChannelCode: String
    ): AmbassadorDataResponse {
        return ipbAmbassadorApi.setNewNumber(
            accessToken,
            SetNewPhoneRequest(accessToken, phone, verifiedChannelCode)
        )
    }

    override suspend fun removeBonuses(
        accessToken: String,
        outType: Int,
        sum: Int
    ): RemoveBonusesResponse {
        return ipbAmbassadorApi.removeBonuses(
            RemoveBonusesRequest(accessToken, outType, sum)
        )
    }

    override suspend fun getConfirmedApplications(accessToken: String): ApplicationsResponse {
        return ipbAmbassadorApi.getConfirmedApplications(accessToken)
    }

    override suspend fun getNotConfirmedApplications(accessToken: String): ApplicationsResponse {
        return ipbAmbassadorApi.getNotConfirmedApplications(accessToken)
    }

    override suspend fun getInviteInfo(accessToken: String): AmbassadorInviteDataResponse {
        return ipbAmbassadorInviteApi.getInviteInfo(accessToken)
    }

    override suspend fun sendInvites(invitingMembersRequest: InvitingMembersRequest): InviteByPhoneResponse {
        return ipbAmbassadorInviteApi.sendInvites(invitingMembersRequest)
    }
}