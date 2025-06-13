package com.netflixdgsspring.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "`show`")
data class ShowEntity(
    val title: String,
    val directorId: Long,
    @Id val id: Long? = null,
    @Transient val director: DirectorEntity? = null,
)