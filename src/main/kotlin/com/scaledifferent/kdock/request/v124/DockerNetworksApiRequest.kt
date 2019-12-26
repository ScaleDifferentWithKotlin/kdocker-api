package com.scaledifferent.kdock.request.v124

interface DockerNetworksApiRequest {

    fun listNetworks()
    fun inspectNetwork()
    fun createNetwork()
    fun connectContainerToNetwork()
    fun disconnectContainerFromNetwork()
    fun removeNetwork()

}