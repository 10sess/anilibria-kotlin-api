package ru.tensess.api.service

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import ru.tensess.api.data.session.SessionIdResponse

interface LoginApiService {

    @FormUrlEncoded
    @POST("login.php")
    suspend fun getSessionId(
        @Field("mail") login: String,
        @Field("passwd") password: String,
    ): SessionIdResponse
}