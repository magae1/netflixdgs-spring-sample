package com.netflixdgsspring.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("director")
data class DirectorEntity(
    val name: String,
    @Id val id: Long? = null,
)