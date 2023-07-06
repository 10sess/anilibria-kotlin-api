package ru.tensess.api.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class UserStatus(
    @JsonProperty("success") val success: Boolean
)
