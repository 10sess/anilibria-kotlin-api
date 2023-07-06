package ru.tensess.api.data.torrent

import com.fasterxml.jackson.annotation.JsonProperty
import ru.tensess.api.data.updates.UpdatesPagination

data class TorrentSeedStatsResponse(
    @JsonProperty("list") val list: List<TorrentSeedStats>?,
    @JsonProperty("pagination") val pagination: UpdatesPagination?,
)
