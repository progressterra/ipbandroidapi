package com.progressterra.ipbandroidapi.api.scrm.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * Values: PHONE,CARDS,EMAIL,FACEBOOK,VK,DEVICE,UNKNOWN,TELEGRAM,MANUAL
 */

enum class TypeChannelEnum {

    @SerializedName("phone")
    PHONE,

    @SerializedName("cards")
    CARDS,

    @SerializedName("email")
    EMAIL,

    @SerializedName("facebook")
    FACEBOOK,

    @SerializedName("vk")
    VK,

    @SerializedName("device")
    DEVICE,

    @SerializedName("unknown")
    UNKNOWN,

    @SerializedName("telegram")
    TELEGRAM,

    @SerializedName("manual")
    MANUAL;
}

