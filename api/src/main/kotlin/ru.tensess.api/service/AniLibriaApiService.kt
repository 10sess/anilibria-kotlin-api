package ru.tensess.api.service

import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Query
import ru.tensess.api.data.feed.FeedResponse
import ru.tensess.api.data.franchise.FranchiseResponse
import ru.tensess.api.data.schedule.ScheduleDayResponse
import ru.tensess.api.data.title.TitleFranchises
import ru.tensess.api.data.title.TitleResponse
import ru.tensess.api.data.torrent.TorrentSeedStatsResponse
import ru.tensess.api.data.updates.UpdatesResponse
import ru.tensess.api.data.user.UserResponse
import ru.tensess.api.data.user.UserStatus
import ru.tensess.api.data.youtube.YouTubeResponse
import ru.tensess.api.types.DescriptionType
import ru.tensess.api.types.PlaylistType
import ru.tensess.api.types.SortDirection

interface AniLibriaApiService {

    @GET("title")
    suspend fun getTitle(
        @Query("id") id: Int? = null,
        @Query("code") code: String? = null,
        @Query("torrent_id") torrentId: Int? = null,
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
    ): TitleResponse

    @GET("title/list")
    suspend fun getTitles(
        @Query("id_list") ids: String? = null,
        @Query("code_list") codes: String? = null,
        @Query("torrent_id_list") torrentIds: String? = null,
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): List<TitleResponse>

    @GET("title/updates")
    suspend fun getUpdates(
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("limit") limit: Int = 5,
        @Query("since") since: Int? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
        @Query("after") after: Int? = null,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): UpdatesResponse

    @GET("title/changes")
    suspend fun getChanges(
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("limit") limit: Int = 5,
        @Query("since") since: Int? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
        @Query("after") after: Int? = null,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): UpdatesResponse

    @GET("title/schedule")
    suspend fun getSchedule(
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("days") days: String? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
    ): List<ScheduleDayResponse>

    @GET("title/random")
    suspend fun getRandom(
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
    ): TitleResponse

    @GET("title/search")
    suspend fun search(
        @Query("search") searches: String? = null,
        @Query("year") years: String? = null,
        @Query("type") types: String? = null,
        @Query("season_code") seasonCodes: String? = null,
        @Query("genres") genres: String? = null,
        @Query("team") teams: String? = null,
        @Query("voice") voices: String? = null,
        @Query("translator") translators: String? = null,
        @Query("editing") editors: String? = null,
        @Query("decor") decors: String? = null,
        @Query("timing") timings: String? = null,
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
        @Query("limit") limit: Int = 5,
        @Query("after") after: Int? = null,
        @Query("order_by") order: String? = null,
        @Query("sort_direction") sortDirection: SortDirection = SortDirection.INCREASE,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): UpdatesResponse

    @GET("title/search/advanced")
    suspend fun searchAdvanced(
        @Query("query") query: String,
        @Query("simple_query") simpleQuery: String? = null,
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
        @Query("limit") limit: Int = 5,
        @Query("after") after: Int? = null,
        @Query("order_by") order: String? = null,
        @Query("sort_direction") sortDirection: SortDirection = SortDirection.INCREASE,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): UpdatesResponse

    @GET("title/franchises")
    suspend fun getFranchises(
        @Query("id") id: Int,
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
    ): List<TitleFranchises>

    @GET("franchise/list")
    suspend fun getFranchiseList(
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("limit") limit: Int = 5,
        @Query("after") after: Int? = null,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): FranchiseResponse

    @GET("youtube")
    suspend fun getYouTube(
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("limit") limit: Int = 5,
        @Query("since") since: Int? = null,
        @Query("after") after: Int? = null,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): YouTubeResponse

    @GET("torrent/seed_stats")
    suspend fun getSeedStats(
        @Query("users") users: String? = null,
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("limit") limit: Int = 5,
        @Query("after") after: Int? = null,
        @Query("sort_by") order: String? = null,
        @Query("order") sortDirection: SortDirection = SortDirection.INCREASE,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): TorrentSeedStatsResponse

    @GET("feed")
    suspend fun getFeed(
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("limit") limit: Int = 5,
        @Query("since") since: Int? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
        @Query("after") after: Int? = null,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): FeedResponse

    @GET("user/favorites")
    suspend fun getFavorites(
        @Query("session") sessionId: String,
        @Query("filter") filter: String? = null,
        @Query("remove") remove: String? = null,
        @Query("include") include: String? = null,
        @Query("description_type") descriptionType: DescriptionType = DescriptionType.PLAIN,
        @Query("playlist_type") playlistType: PlaylistType = PlaylistType.OBJECT,
        @Query("limit") limit: Int = 5,
        @Query("after") after: Int? = null,
        @Query("page") page: Int? = null,
        @Query("items_per_page") perPage: Int? = null,
    ): UpdatesResponse

    @PUT("user/favorites")
    suspend fun addFavorites(
        @Query("session") sessionId: String,
        @Query("title_id") titleId: Int,
    ): UserStatus

    @PUT("user/favorites")
    suspend fun removeFavorites(
        @Query("session") sessionId: String,
        @Query("title_id") titleId: Int,
    ): UserStatus

    @GET("user")
    suspend fun getUser(
        @Query("session") sessionId: String
    ): UserResponse

    @GET("years")
    suspend fun getYears(): List<Int>

    @GET("genres")
    suspend fun getGenres(): List<String>

    @GET("team")
    suspend fun getTeam(): Map<String, List<String>>
}