package ru.tensess.api.data.updates

import com.fasterxml.jackson.annotation.JsonProperty
import ru.tensess.api.data.title.TitleResponse

data class UpdatesResponse(
    @JsonProperty("list") val list: List<TitleResponse>?,
    @JsonProperty("pagination") val pagination: UpdatesPagination?,
)
