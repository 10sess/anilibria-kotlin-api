package ru.tensess.api.data.youtube

import com.fasterxml.jackson.annotation.JsonProperty
import ru.tensess.api.data.updates.UpdatesPagination

data class YouTubeResponse(
    @JsonProperty("list") val list: List<YouTubeVideo>?,
    @JsonProperty("pagination") val pagination: UpdatesPagination?,
)
