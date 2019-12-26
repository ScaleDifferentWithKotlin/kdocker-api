/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

package com.scaledifferent.kdock.response.v124

import com.scaledifferent.kdock.response.v124.type.ContainerApiResponseType
import com.scaledifferent.util.loadFileIntoString
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ContainerApiResponseDestructorTest {

    val containerDestructor = ContainerApiResponseDestructor()

    @Test
    fun `destruct listAllContainers response and map to ContainerApiResponse`() {

        val response: ContainerApiResponse = containerDestructor.destructJsonResponse(loadJsonFileToString("ListContainersResponse.json"),
            ContainerApiResponseType.LIST_CONTAINERS)

        Assertions.assertEquals("8dfafdbc3a40", response.container.id)
    }

    private fun loadJsonFileToString(fileName: String): String {

        return loadFileIntoString(fileName)
    }
}
