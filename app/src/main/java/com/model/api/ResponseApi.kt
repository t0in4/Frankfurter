package com.model.api

import com.model.response.Currencies
import com.model.response.Frankfurter
import retrofit2.http.GET

interface ResponseApi {
    @GET("latest")
    suspend fun getRates(): Frankfurter
}