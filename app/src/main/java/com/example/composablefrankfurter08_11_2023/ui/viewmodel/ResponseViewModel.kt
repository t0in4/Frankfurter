package com.example.composablefrankfurter08_11_2023.ui.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.model.Repository
import com.model.response.Frankfurter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ResponseViewModel (
    private val repository: Repository = Repository()
): ViewModel() {
    val responseState: MutableState<List<Frankfurter>> = mutableStateOf(emptyList())
    suspend fun getRates(): Frankfurter {
        return repository.getRates()
    }
    init {
        viewModelScope.launch(Dispatchers.IO) {
            val rates = getRates()
            responseState.value = listOf(rates)
        }
    }
}