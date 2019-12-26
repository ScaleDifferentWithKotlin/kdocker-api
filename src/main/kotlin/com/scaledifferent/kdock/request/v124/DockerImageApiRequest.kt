package com.scaledifferent.kdock.request.v124

interface DockerImageApiRequest {

    fun listImages()
    fun buildImageFromDockerfile()
    fun createImage()
    fun inspectImage()
    fun getImageHistory()
    fun pushImageToRegstry()
    fun tagImageIntoRepo()
    fun searchImages()


}