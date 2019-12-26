/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

package com.scaledifferent.kdock.request.v124

interface DockerNetworksApiRequest {

    fun listNetworks()
    fun inspectNetwork()
    fun createNetwork()
    fun connectContainerToNetwork()
    fun disconnectContainerFromNetwork()
    fun removeNetwork()

}
