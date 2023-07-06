package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleEpisodes(
    @JsonProperty("first") val first: Int?,
    @JsonProperty("last") val last: Int?,
    @JsonProperty("string") val range: String?,
)
