package com.progressterra.ipbandroidapi.api.ambassadorinvite.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param promocode 
 * @param textInvite 
 * @param textInstruction Текст инструукция о том, как стать амбасадором
 * @param urlVideoInstruction Ссылка на видео о том как стать амбасадором
 */
data class InviteData (

    @SerializedName("promocode")
    val promocode: String? = null,

    @SerializedName("textInvite")
    val textInvite: String? = null,

    /* Текст инструукция о том, как стать амбасадором */
    @SerializedName("textInstruction")
    val textInstruction: String? = null,

    /* Ссылка на видео о том как стать амбасадором */
    @SerializedName("urlVideoInstruction")
    val urlVideoInstruction: String? = null

)

