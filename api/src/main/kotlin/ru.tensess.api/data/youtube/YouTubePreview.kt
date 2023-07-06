package ru.tensess.api.data.youtube

import com.fasterxml.jackson.annotation.JsonProperty

data class YouTubePreview(
    @JsonProperty("src") val source: String?,
    @JsonProperty("thumbnail") val thumbnail: String?,
)
