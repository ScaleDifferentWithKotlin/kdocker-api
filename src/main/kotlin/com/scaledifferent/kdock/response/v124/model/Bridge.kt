/*
 *  Copyright (c) 2019 Scale different UG (Haftungsbeschränkt) and contributors. Use of this
 *  source code is governed by the Apache 2.0 license.
 *
 */

package com.scaledifferent.kdock.response.v124.model

data class Bridge(
    val iPAMConfig: String,
    val links: String,
    val aliases: String,
    val networkID: String,
    val endpointID: String,
    val gateway: String,
    val iPAddress: String,
    val iPPrefixLen: Int,
    val iPv6Gateway: String,
    val globalIPv6Address: String,
    val globalIPv6PrefixLen: Int,
    val macAddress: String,
    val additionalProperties: MutableMap<String, String>
)

