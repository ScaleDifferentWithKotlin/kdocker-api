/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

package com.scaledifferent.kdock.response.v124.mapper

import com.google.gson.JsonElement

interface ResponseToModelMapper {

    fun <T: ResponseToModelMapper> mapToModel(jsonElement: JsonElement): T
}
