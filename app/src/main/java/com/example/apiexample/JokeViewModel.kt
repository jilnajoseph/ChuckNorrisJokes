package com.example.apiexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class JokeUiState(
    val joke: String = "",
    val iconUrl: String? = "",
    val isLoading: Boolean = false,
    val error: String? = null
)


class JokeViewModel : ViewModel() {

    private val _uiState= MutableStateFlow(JokeUiState())
    val uiState = _uiState.asStateFlow()

    private val api = ApiService.create()
    init {
       fetchJoke()
    }

    fun fetchJoke() {
        viewModelScope.launch {

            _uiState.value = JokeUiState(isLoading = true)
            try {
                val response = api.getRandomJoke()

                _uiState.value = JokeUiState(
                    joke = response.value,
                    iconUrl = response.icon_url,
                    isLoading = false
                )

            }
            catch (e: Exception){
                _uiState.value = JokeUiState(
                    error= "Failed to load Joke: ${e.message}",
                    isLoading = false
                )

            }
        }

    }

}