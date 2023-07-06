package ru.tensess.api.types

import com.fasterxml.jackson.annotation.JsonValue

enum class SortDirection {

    INCREASE,
    DECREASE,;

    @JsonValue
    override fun toString() = ordinal.toString()
}