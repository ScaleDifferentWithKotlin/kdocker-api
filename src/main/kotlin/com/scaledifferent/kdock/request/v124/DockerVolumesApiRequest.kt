/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

package com.scaledifferent.kdock.request.v124

interface DockerVolumesApiRequest {

    fun listVolumes()
    fun createVolume()
    fun inspectVolume()
    fun removeVolume()

}
