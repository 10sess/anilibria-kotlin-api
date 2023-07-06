package ru.tensess.api.data.youtube

import com.fasterxml.jackson.annotation.JsonProperty

data class YouTubeVideo(
    @JsonProperty("id") val id: Int?,
    @JsonProperty("title") val title: String?,
    @JsonProperty("preview") val preview: YouTubePreview?,
    @JsonProperty("youtube_id") val youtubeId: String?,
    @JsonProperty("comments") val comments: Int?,
    @JsonProperty("views") val views: Int?,
    @JsonProperty("timestamp") val timestamp: Long?,
)
