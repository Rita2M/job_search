package ru.myproject.data.retrofit

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("u/0/uc?id=1z4TbeDkbfXkvgpoJprXbN85uCcD7f00r&export=download")
    suspend fun getData(): Response<ResponseData>
}
