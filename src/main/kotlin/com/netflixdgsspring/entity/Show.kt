package com.netflixdgsspring.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name= "`show`")
data class Show (
    val title: String,
    val actorId: Long,
    @Id val id: Long? = null,
)