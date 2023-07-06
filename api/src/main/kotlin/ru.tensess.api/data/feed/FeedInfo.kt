package ru.tensess.api.data.feed

import com.fasterxml.jackson.annotation.JsonProperty
import ru.tensess.api.data.title.TitleResponse
import ru.tensess.api.data.youtube.YouTubeVideo

data class FeedInfo(
    @JsonProperty("title") val title: TitleResponse?,
    @JsonProperty("youtube") val youtube: YouTubeVideo?,
)
