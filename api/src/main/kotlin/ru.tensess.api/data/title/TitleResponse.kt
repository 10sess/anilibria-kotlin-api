package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleResponse(
    @JsonProperty("id") val id: Int?,
    @JsonProperty("code") val code: String?,
    @JsonProperty("names") val names: TitleNames?,
    @JsonProperty("franchises") val franchises: List<TitleFranchises>?,
    @JsonProperty("announce") val announce: String?,
    @JsonProperty("status") val status: TitleStatus?,
    @JsonProperty("posters") val posters: Map<String, TitlePoster>?,
    @JsonProperty("updated") val updated: Long?,
    @JsonProperty("last_change") val lastChange: Long?,
    @JsonProperty("type") val type: TitleType?,
    @JsonProperty("genres") val genres: List<String>?,
    @JsonProperty("team") val team: Map<String, List<String>>?,
    @JsonProperty("season") val season: TitleSeason?,
    @JsonProperty("description") val description: String?,
    @JsonProperty("in_favorites") val inFavorites: Long?,
    @JsonProperty("blocked") val blocked: Map<String, Boolean>?,
    @JsonProperty("player") val player: TitlePlayer?,
    @JsonProperty("torrents") val torrents: TitleTorrents?,
)