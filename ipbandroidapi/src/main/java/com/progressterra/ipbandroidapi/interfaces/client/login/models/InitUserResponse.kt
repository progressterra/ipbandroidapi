package com.progressterra.ipbandroidapi.interfaces.client.login.models

import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus

data class InitUserResponse(val status: GlobalResponseStatus, val errorString: String? = null) {
}