package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleStatus(
    @JsonProperty("string") val string: String?,
    @JsonProperty("code") val code: Int?,
)
