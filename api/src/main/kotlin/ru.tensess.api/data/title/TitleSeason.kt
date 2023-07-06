package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleSeason(
    @JsonProperty("string") val string: String?,
    @JsonProperty("code") val code: Int?,
    @JsonProperty("year") val year: Int?,
    @JsonProperty("week_day") val weekDay: Int?,
)
