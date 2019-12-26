package com.scaledifferent.kdock.request.v124

interface DockerVolumesApiRequest {

    fun listVolumes()
    fun createVolume()
    fun inspectVolume()
    fun removeVolume()

}