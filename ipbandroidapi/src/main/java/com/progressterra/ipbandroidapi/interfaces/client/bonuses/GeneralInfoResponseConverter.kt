package com.progressterra.ipbandroidapi.interfaces.client.bonuses

import android.util.Log
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.Data
import com.progressterra.ipbandroidapi.utils.extentions.parseToDate
import java.text.SimpleDateFormat
import java.util.*


internal object GeneralInfoResponseConverter {

    // ковертируем дату в нужный нам формат для отображения
    private fun convertDate(dateString: String?): String {
        if (dateString == null) {
            return ""
        }
        val date = dateString.parseToDate()
        val sdf = SimpleDateFormat("dd.MM", Locale.getDefault())
        return sdf.format(date)
    }

    fun convert(data: Data?) =
        BonusesInfo(
            currentQuantity = data?.currentQuantity?.toInt() ?: 0,
            dateBurning = convertDate(data?.dateBurning),
            forBurningQuantity = data?.forBurningQuantity?.toInt() ?: 0,
            typeBonusName = data?.typeBonusName ?: ""
        )
}