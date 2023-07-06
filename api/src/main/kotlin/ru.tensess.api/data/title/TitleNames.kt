package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleNames(
    @JsonProperty("ru") val russian: String?,
    @JsonProperty("en") val english: String?,
    @JsonProperty("alternative") val alternative: String?,
)
