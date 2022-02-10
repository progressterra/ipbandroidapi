package com.progressterra.ipbandroidapi.api.ipbAmbassador

import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.ambassador_status.AmbassadorStatusResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.BankInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateBankDataRequest
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateBankInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.cooperation_type.CooperationListResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.direct_payment.AmbassadorDataResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.direct_payment.SetNewPhoneRequest
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members.AmbassadorInviteDataResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members.InviteByPhoneResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members.InvitingMembersRequest
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.upload_file.UploadContractOfAmbassadorRequest
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.upload_file.UploadImageUrlRequest
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import okhttp3.ResponseBody
import retrofit2.Response

internal class IPBAmbassadorImpl : IPBAmbassador.Ambassador, IPBAmbassador.AmbassadorInvite {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val ipbAmbassadorApi =
        networkService.createService(
            IPBAmbassadorApi.Ambassador::class.java,
            NetworkSettings.AMBASSADOR_URL
        )

    private val ipbAmbassadorInviteApi =
        networkService.createService(
            IPBAmbassadorApi.AmbassadorInvite::class.java,
            NetworkSettings.AMBASSADOR_INVITE_URL
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

    override suspend fun getInviteInfo(accessToken: String): AmbassadorInviteDataResponse {
        return ipbAmbassadorInviteApi.getInviteInfo(accessToken)
    }

    override suspend fun sendInvites(invitingMembersRequest: InvitingMembersRequest): InviteByPhoneResponse {
        return ipbAmbassadorInviteApi.sendInvites(invitingMembersRequest)
    }
}