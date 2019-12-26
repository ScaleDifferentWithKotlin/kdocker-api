package com.scaledifferent.kdock.request.v124

interface DockerContainerApiRequest {

    fun listContainers()
    fun createContainer()
    fun inspectContainer()
    fun listProcessesInContainer()
    fun inspectChangesOnContainerFileSystem()
    fun getContainerStatsResourceUsage()
    fun resizeContainerTTY()
    fun stopContainer()
    fun restartContainer()
    fun updateContainer()
    fun renameContainer()
    fun pauseContainer()
    fun unpauseContainer()
    fun attachToContainer()
    fun attachToContainerOverWebSocket()
    fun waitContainer()
    fun removeContainer()
    fun getInfoFilesAndFoldersContainer()
    fun getArchiveOfResource()
    fun extractArchiveToContainer()

}