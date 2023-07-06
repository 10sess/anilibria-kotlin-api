package ru.tensess.api.data.schedule

import com.fasterxml.jackson.annotation.JsonProperty
import ru.tensess.api.data.title.TitleResponse

data class ScheduleDayResponse(
    @JsonProperty("day") val day: Int?,
    @JsonProperty("list") val list: List<TitleResponse>?,
)