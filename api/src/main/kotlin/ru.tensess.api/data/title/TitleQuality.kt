package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleQuality(
    @JsonProperty("string") val string: String?,
    @JsonProperty("type") val type: String?,
    @JsonProperty("resolution") val resolution: String?,
    @JsonProperty("encoder") val encoder: String?,
    @JsonProperty("lq_audio") val audio: Any?
)
