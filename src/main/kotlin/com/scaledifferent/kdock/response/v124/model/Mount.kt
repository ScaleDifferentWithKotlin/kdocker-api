package com.scaledifferent.kdock.response.v124.model

data class Mount(
    val name: String,
    val source: String,
    val destination: String,
    val driver: String,
    val mode: String,
    val rW: Boolean,
    val propagation: String,
    val additionalProperties: Map<String, String>
)
