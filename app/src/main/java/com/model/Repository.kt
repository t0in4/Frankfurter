package com.model

import com.model.api.WebService
import com.model.response.Currencies
import com.model.response.Frankfurter

class Repository(
    private val webService: WebService = WebService()
) {
    suspend fun getRates(): Frankfurter {
        return webService.getRates()
    }
}