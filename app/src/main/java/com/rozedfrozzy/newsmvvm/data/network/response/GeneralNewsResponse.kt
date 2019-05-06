package com.rozedfrozzy.newsmvvm.data.network.response


data class GeneralNewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)