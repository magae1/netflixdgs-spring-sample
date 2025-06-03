package com.netflixdgsspring.repository

import com.netflixdgsspring.entity.Show
import org.springframework.data.repository.kotlin.CoroutineCrudRepository


interface CoroutineShowRepository  : CoroutineCrudRepository<Show, Long>