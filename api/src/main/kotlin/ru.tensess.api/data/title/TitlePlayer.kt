package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitlePlayer(
    @JsonProperty("alternative_player") val alternativePlayer: String?,
    @JsonProperty("host") val host: String?,
    @JsonProperty("episodes") val episodes: TitleEpisodes?,
    @JsonProperty("list") val list: Map<String, TitleEpisode>?,
)
