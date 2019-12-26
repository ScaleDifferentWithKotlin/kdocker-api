package com.scaledifferent.util

import kotlinx.io.core.String
import org.apache.commons.io.IOUtils
import java.io.FileInputStream

fun loadFileIntoString(fileName: String): String {

    FileInputStream(fileName).use {
        return IOUtils.toString(it, "UTF-8")
    }

}