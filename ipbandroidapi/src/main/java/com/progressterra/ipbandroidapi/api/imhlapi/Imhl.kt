package com.progressterra.ipbandroidapi.api.imhlapi

import com.progressterra.ipbandroidapi.api.imhlapi.models.compile.CompiledSessionResponse
import com.progressterra.ipbandroidapi.api.imhlapi.models.session.SessionListResponse

/**
 * http://84.201.188.117:7001/docsapi/v1/index.html
 */
interface Imhl {
    interface Compile {
        suspend fun compileSession(sessionId: String): CompiledSessionResponse
    }

    interface Session {
        /**
         * @param skipCount Для пагинации - сколько пропускаем
         * @param takeCount Для пагинации - сколько выводим
         */
        suspend fun getSessionList(skipCount: Int, takeCount: Int): SessionListResponse
    }

    companion object {
        fun Compile(): Compile = ImhlImpl()
        fun Session(): Session = ImhlImpl()
    }
}