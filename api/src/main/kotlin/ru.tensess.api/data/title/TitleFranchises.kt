package ru.tensess.api.data.title

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleFranchises(
    @JsonProperty("franchise") val franchise: TitleFranchise?,
    @JsonProperty("releases") val releases: List<TitleRelease>?
)
