package com.netflixdgsspring.repository

import com.netflixdgsspring.entity.DirectorEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository


interface CoroutineDirectorRepository : CoroutineCrudRepository<DirectorEntity, Long>