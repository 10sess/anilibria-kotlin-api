package ru.tensess.api.data.franchise

import com.fasterxml.jackson.annotation.JsonProperty
import ru.tensess.api.data.title.TitleFranchises
import ru.tensess.api.data.updates.UpdatesPagination

data class FranchiseResponse(
    @JsonProperty("list") val list: List<TitleFranchises>?,
    @JsonProperty("pagination") val pagination: UpdatesPagination?
)
