package com.progressterra.ipbandroidapi.interfaces.client.login.models

import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus

data class InitUserResponse(var status: GlobalResponseStatus, var errorString: String? = null) {
}