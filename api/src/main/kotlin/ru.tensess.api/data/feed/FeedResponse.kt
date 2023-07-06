package ru.tensess.api.data.feed

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedResponse(
    @JsonProperty("list") val list: List<FeedInfo>?
)
