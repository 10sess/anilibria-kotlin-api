package ru.tensess.api.types

import com.fasterxml.jackson.annotation.JsonValue

enum class PlaylistType {

    OBJECT,
    ARRAY,;

    @JsonValue
    override fun toString() = name.lowercase()
}