package ru.tensess.api.data.updates

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdatesPagination(
    @JsonProperty("pages") val pages: Int?,
    @JsonProperty("current_page") val currentPage: Int?,
    @JsonProperty("items_per_page") val perPage: Int?,
    @JsonProperty("total_items") val total: Int?,
)
