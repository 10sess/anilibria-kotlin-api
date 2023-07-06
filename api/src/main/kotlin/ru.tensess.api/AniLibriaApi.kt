package ru.tensess.api

import okhttp3.*
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import ru.tensess.api.service.AniLibriaApiService
import ru.tensess.api.service.LoginApiService
import ru.tensess.api.utils.mapper
import java.util.concurrent.TimeUnit

const val URL = "https://api.anilibria.tv/v3/"
const val LOGIN_URL = "https://www.anilibria.tv/public/"

class AniLibriaApi {

    val client = OkHttpClient.Builder()
        .callTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val aniLibriaRetrofit = Retrofit.Builder()
        .baseUrl(URL)
        .client(client)
        .addConverterFactory(JacksonConverterFactory.create(mapper))
        .build()

    private val loginRetrofit = Retrofit.Builder()
        .baseUrl(LOGIN_URL)
        .client(client)
        .addConverterFactory(JacksonConverterFactory.create(mapper))
        .build()

    val aniLibriaApiService: AniLibriaApiService = aniLibriaRetrofit.create(AniLibriaApiService::class.java)

    val loginApiService: LoginApiService = loginRetrofit.create(LoginApiService::class.java)
}