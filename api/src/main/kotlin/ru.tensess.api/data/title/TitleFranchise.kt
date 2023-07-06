package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.UUID

data class TitleFranchise(
    @JsonProperty("id") val id: UUID?,
    @JsonProperty("name") val name: String?,
)
