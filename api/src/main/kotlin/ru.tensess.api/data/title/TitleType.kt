package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleType(
    @JsonProperty("full_string") val description: String?,
    @JsonProperty("code") val code: String?,
    @JsonProperty("string") val type: String?,
    @JsonProperty("episodes") val episodes: Int?,
    @JsonProperty("length") val length: Int?,
)
