package com.progressterra.ipbandroidapi.bonuses_repository

import android.util.Log
import com.progressterra.ipbandroidapi.repository.models.bonuses_info.Data
import java.text.SimpleDateFormat
import java.util.*


internal object GeneralInfoResponseConverter {

    // ковертируем дату в нужный нам формат для отображения
    private fun convertDate(dateString: String?): String {
        if (dateString == null) {
            return ""
        }
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
        try {
            val parsedDate = simpleDateFormat.parse(dateString)
            val calendar = GregorianCalendar()
            calendar.time = parsedDate
            val month = ((calendar.get(Calendar.MONTH) + 1) % 13).toString()
            val formattedMonth = if (month.length == 1) "0$month" else month
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            return "$day.$formattedMonth"
        } catch (e: Exception) {
            Log.v("dateParse", e.toString())
        }
        return ""
    }

    internal fun convert(data: Data?): BonusesInfo {
        return if (data != null) {
            BonusesInfo(
                currentQuantity = (data.currentQuantity?.toInt()).toString(),
                dateBurning = convertDate(data.dateBurning),
                forBurningQuantity = (data.forBurningQuantity?.toInt()).toString(),
                typeBonusName = data.typeBonusName ?: ""
            )
        } else {
            BonusesInfo("0", "", "0", "")
        }
    }

}