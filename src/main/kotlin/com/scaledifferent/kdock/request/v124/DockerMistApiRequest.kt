/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

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
