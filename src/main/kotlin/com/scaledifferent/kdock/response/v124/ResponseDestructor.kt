/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

package com.scaledifferent.kdock.response.v124

import com.scaledifferent.kdock.response.v124.type.ApiType

interface ResponseDestructor {

    fun destructJsonResponse(jsonString: String, apiType: ApiType)
}
