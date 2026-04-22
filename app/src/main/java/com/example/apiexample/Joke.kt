package com.example.apiexample

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Joke(
    @SerializedName("icon_url")
    val icon_url: String? = null,
    val id : String,
    val url: String,
    val value: String
)

