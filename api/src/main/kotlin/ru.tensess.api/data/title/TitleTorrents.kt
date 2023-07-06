package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleTorrents(
    @JsonProperty("episodes") val episodes: TitleEpisodes?,
    @JsonProperty("list") val list: List<TitleTorrent>?
)
