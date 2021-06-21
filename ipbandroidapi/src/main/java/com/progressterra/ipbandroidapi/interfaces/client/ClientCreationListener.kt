package com.progressterra.ipbandroidapi.interfaces.client

interface ClientCreationListener {
    fun onClientSuccessfullyCreated()
    fun onClientCreatedError(msg: String)
}