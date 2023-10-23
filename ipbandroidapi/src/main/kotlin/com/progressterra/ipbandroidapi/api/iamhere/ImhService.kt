package com.progressterra.ipbandroidapi.api.iamhere

import com.progressterra.ipbandroidapi.api.iamhere.models.EmptyResultOperationResultData
import com.progressterra.ipbandroidapi.api.iamhere.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.iamhere.models.GeoData
import com.progressterra.ipbandroidapi.api.iamhere.models.IncomeDataIDClient
import com.progressterra.ipbandroidapi.api.iamhere.models.IncomeDataIDConnect
import com.progressterra.ipbandroidapi.api.iamhere.models.IncomeDataIDRFInterest
import com.progressterra.ipbandroidapi.api.iamhere.models.IncomeDataStartMeet
import com.progressterra.ipbandroidapi.api.iamhere.models.RFInterestViewModelResultDataList
import com.progressterra.ipbandroidapi.api.iamhere.models.RFTargetViewModelResultDataList
import com.progressterra.ipbandroidapi.api.iamhere.models.RGClientDataPersonalEntity
import com.progressterra.ipbandroidapi.api.iamhere.models.RGClientDataViewModelResultData
import com.progressterra.ipbandroidapi.api.iamhere.models.RGClientDataViewModelResultDataList
import com.progressterra.ipbandroidapi.api.iamhere.models.RGClientInterestResultDataList
import com.progressterra.ipbandroidapi.api.iamhere.models.RGConnectViewModelResultData
import com.progressterra.ipbandroidapi.api.iamhere.models.RGConnectViewModelResultDataList
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface ImhService {

    @GET("/clientdata/around/{minMeter}/{maxMeter}/list")
    suspend fun clientDataAround(
        @Header("AccessToken") token: String,
        @Path("minMeter") minMeter: Int,
        @Path("maxMeter") maxMeter: Int
    ): RGClientDataViewModelResultDataList

    @POST("clientdata/personal")
    suspend fun clientDataPersonal(
        @Header("AccessToken") token: String,
        @Body body: RGClientDataPersonalEntity
    ): RGClientDataViewModelResultData

    @GET("clientdata/data")
    suspend fun clientDataData(
        @Header("AccessToken") token: String
    ): RGClientDataViewModelResultData

    @POST("/clientdata/readymeet")
    suspend fun clientDataReadyMeet(
        @Header("AccessToken") token: String,
        @Body body: IncomeDataStartMeet
    ): RGClientDataViewModelResultData

    @DELETE("/clientdata/readymeet")
    suspend fun clientDataReadyMeetDelete(
        @Header("AccessToken") token: String
    ): RGClientDataViewModelResultData

    @POST("/clientdata/readymeet")
    suspend fun clientDataGeoData(
        @Header("AccessToken") token: String,
        @Body body: GeoData
    ): RGClientDataViewModelResultData

    @POST("/clientinterest")
    suspend fun clientInterest(
        @Header("AccessToken") token: String,
        @Body body: IncomeDataIDRFInterest
    ): RGClientDataViewModelResultData

    @DELETE("/clientinterest")
    suspend fun clientInterestDelete(
        @Header("AccessToken") token: String,
        @Body body: IncomeDataIDRFInterest
    ): RGClientDataViewModelResultData

    @POST("/clientinterest/list")
    suspend fun clientInterestList(
        @Header("AccessToken") token: String,
        @Body body: FilterAndSort
    ): RGClientInterestResultDataList

    @POST("/interest/list")
    suspend fun interestList(
        @Header("AccessToken") token: String,
        @Body body: FilterAndSort
    ): RFInterestViewModelResultDataList

    @POST("/target/list")
    suspend fun targetList(
        @Header("AccessToken") token: String,
        @Body body: FilterAndSort
    ): RFTargetViewModelResultDataList

    @POST("/connect/approve")
    suspend fun connectApprove(
        @Header("AccessToken") token: String,
        @Body body: IncomeDataIDConnect
    ): EmptyResultOperationResultData

    @POST("/connect/reject")
    suspend fun connectReject(
        @Header("AccessToken") token: String,
        @Body body: IncomeDataIDConnect
    ): EmptyResultOperationResultData

    @POST("/connect")
    suspend fun connect(
        @Header("AccessToken") token: String,
        @Body body: IncomeDataIDClient
    ): RGConnectViewModelResultData

    @POST("/connect/incoming/list")
    suspend fun connectsIncoming(
        @Header("AccessToken") token: String,
        @Body body: FilterAndSort
    ): RGConnectViewModelResultDataList

    @POST("/connect/outcoming/list")
    suspend fun connectsOutcoming(
        @Header("AccessToken") token: String,
        @Body body: FilterAndSort
    ): RGConnectViewModelResultDataList
}