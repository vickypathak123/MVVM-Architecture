package com.vasundhara.mvvm.data.api

import com.vasundhara.mvvm.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}