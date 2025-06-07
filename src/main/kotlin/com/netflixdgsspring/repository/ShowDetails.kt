package com.netflixdgsspring.repository


data class ShowDetails(
    val id: Long,
    val title: String,
    val directorName: String,
    val directorId: Long
)