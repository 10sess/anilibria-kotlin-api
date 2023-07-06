package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleRelease(
    @JsonProperty("id") val id: Int?,
    @JsonProperty("code") val code: String?,
    @JsonProperty("ordinal") val ordinal: Int?,
    @JsonProperty("names") val names: TitleNames?,
)
