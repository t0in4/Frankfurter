package com.model.api

import com.model.response.Currencies
import com.model.response.Frankfurter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WebService {
    private lateinit var api: ResponseApi
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.frankfurter.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(ResponseApi::class.java)
    }
    suspend fun getRates(): Frankfurter {
        return api.getRates()
    }
}