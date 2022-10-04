package com.progressterra.ipbandroidapi.api.checklist.model

import java.util.*

/**
 *
 * @param idUnique
 * @param idrf_umulativeTest
 * @param idrfParameter Идентфикатор параметра, по которму можно разбивать результаты
 * @param order Порядок вывода вопросов
 * @param bodyQuetion
 * @param urlImage Ссылка на изображение, если оно используется в тесте
 * @param urlVideo Ссылка на видео, если оно используется в тесте
 * @param valueAnswer1
 * @param valueAnswer2
 * @param valueAnswer3
 * @param valueAnswer4
 * @param valueAnswer5
 * @param valueAnswer6
 * @param valueAnswer7
 */
internal data class RFCumulativeTestQuestion(

    val idUnique: UUID?,
    val idrf_umulativeTest: UUID?,
    val idrfParameter: UUID?,
    val order: Int?,
    val bodyQuetion: String?,
    val urlImage: String?,
    val urlVideo: String?,
    val valueAnswer1: Double?,
    val valueAnswer2: Double?,
    val valueAnswer3: Double?,
    val valueAnswer4: Double?,
    val valueAnswer5: Double?,
    val valueAnswer6: Double?,
    val valueAnswer7: Double?
)