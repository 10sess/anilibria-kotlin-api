package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import ru.tensess.api.deserializer.MapDeserializer
import java.util.UUID

data class TitleEpisode(
    @JsonProperty("episode") val episode: Int?,
    @JsonProperty("name") val name: String?,
    @JsonProperty("uuid") val uuid: UUID?,
    @JsonProperty("created_timestamp") val createdTimestamp: Long?,
    @JsonProperty("preview") val preview: Any?,
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("skips") val skips: Map<String, List<Any>>?,
    @JsonProperty("hls") val hls: Map<String, String>?,
)
