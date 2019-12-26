/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

package com.scaledifferent.util

import org.apache.commons.io.IOUtils
import java.io.FileInputStream

fun loadFileIntoString(fileName: String): String {

    FileInputStream(fileName).use {
        return IOUtils.toString(it, "UTF-8")
    }

}
