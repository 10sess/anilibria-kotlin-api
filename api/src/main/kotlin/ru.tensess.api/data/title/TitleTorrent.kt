package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleTorrent(
    @JsonProperty("torrent_id") val id: Int?,
    @JsonProperty("episodes") val episodes: TitleEpisodes?,
    @JsonProperty("quality") val quality: TitleQuality?,
    @JsonProperty("leechers") val leechers: Int?,
    @JsonProperty("seeders") val seeders: Int?,
    @JsonProperty("downloads") val downloads: Long?,
    @JsonProperty("total_size") val totalSize: Long?,
    @JsonProperty("size_string") val sizeString: String?,
    @JsonProperty("url") val url: String?,
    @JsonProperty("magnet") val magnet: String?,
    @JsonProperty("uploaded_timestamp") val uploadedTimestamp: Long?,
    @JsonProperty("hash") val hash: String?,
    @JsonProperty("metadata") val metadata: Any?,
    @JsonProperty("raw_base64_file") val rawFile: Any?
)
