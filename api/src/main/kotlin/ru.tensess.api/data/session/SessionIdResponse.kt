package ru.tensess.api.data.session

import com.fasterxml.jackson.annotation.JsonProperty

data class SessionIdResponse(
    @JsonProperty("err") val status: String,
    @JsonProperty("key") val key: String,
    @JsonProperty("mes") val message: String,
    @JsonProperty("sessionId") val sessionId: String,
)