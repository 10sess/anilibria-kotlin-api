package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitlePoster(
    @JsonProperty("url") val url: String?,
    @JsonProperty("raw_base64_file") val rawFile: Any?
)
