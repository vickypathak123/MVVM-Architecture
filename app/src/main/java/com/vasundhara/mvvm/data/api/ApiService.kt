package com.vasundhara.mvvm.data.api

import com.vasundhara.mvvm.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}