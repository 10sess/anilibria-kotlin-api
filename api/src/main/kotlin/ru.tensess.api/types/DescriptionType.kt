package ru.tensess.api.types

import com.fasterxml.jackson.annotation.JsonValue

enum class DescriptionType {

    HTML,
    PLAIN,
    NO_VIEW_ORDER,;

    @JsonValue
    override fun toString() = name.lowercase()
}