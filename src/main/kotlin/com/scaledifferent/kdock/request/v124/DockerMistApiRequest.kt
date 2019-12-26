package com.scaledifferent.kdock.request.v124

interface DockerMistApiRequest {

    fun checkAuthConfig()
    fun displaySysWideInfo()
    fun showDockerVersion()
    fun pingDockerServer()
    fun createImageFromContainerChange()
    fun monitorDockerEvents()
    fun getTarWithAllImagesFromRepo()
    fun getTarWithAllImages()
    fun loadTarWithImagesIntoDocker()
    fun imageTarFormat()
    fun execCreate()
    fun execStart()
    fun execResize()
    fun execInspect()

}