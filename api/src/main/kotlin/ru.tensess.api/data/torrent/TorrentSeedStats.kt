package ru.tensess.api.data.torrent

import com.fasterxml.jackson.annotation.JsonProperty

data class TorrentSeedStats(
    @JsonProperty("downloaded") val downloaded: Long?,
    @JsonProperty("uploaded") val uploaded: Long?,
    @JsonProperty("user") val user: String?,
)
