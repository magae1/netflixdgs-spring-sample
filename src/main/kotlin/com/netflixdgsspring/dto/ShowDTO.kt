package com.netflixdgsspring.dto

data class ShowDTO(
    val id: Long? = null,
    val title: String,
    val director: DirectorDTO? = null,
)