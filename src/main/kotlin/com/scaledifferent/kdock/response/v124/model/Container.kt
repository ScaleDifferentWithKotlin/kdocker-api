package com.scaledifferent.kdock.response.v124.model

data class Container(
    val id: String,
    val names: List<String>,
    val image: String,
    val imageId: String,
    val command: String,
    val created: Int,
    val state: String,
    val status: String,
    val ports: List<Port>,
    val labels: Labels,
    val sizeRw: Int,
    val sizeRootFs: Int,
    val hostConfig: HostConfig,
    val networkSettings: NetworkSettings,
    val mounts: List<Mount>,
    val additionalProperties: Map<String, String>
)

