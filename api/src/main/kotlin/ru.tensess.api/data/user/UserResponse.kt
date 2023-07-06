package ru.tensess.api.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class UserResponse(
    @JsonProperty("login") val login: String,
    @JsonProperty("nickname") val nickname: String?,
    @JsonProperty("email") val mail: String,
    @JsonProperty("avatar") val avatar: String?,
    @JsonProperty("vk_id") val vkId: String?,
    @JsonProperty("patreon_id") val patreonId: String?,
    @JsonProperty("avatar_original") val avatarOriginal: String,
    @JsonProperty("avatar_thumbnail") val avatarThumbnail: String,
)
