/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

package com.scaledifferent.util

import com.google.gson.JsonElement
import com.google.gson.JsonParser
import com.google.gson.JsonSyntaxException
import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

class JsonFileLoader {

    companion object{

        fun loadJsonFileIntoObject(jsonString: String): JsonElement {

            lateinit var jsonElement: JsonElement

            try {
                jsonElement = JsonParser.parseString(jsonString)
            }catch (e: JsonSyntaxException) {
                logger.debug { "Error, cant read String into jsonElement. Check Syntax" }
            }

            return jsonElement
        }
    }

}
