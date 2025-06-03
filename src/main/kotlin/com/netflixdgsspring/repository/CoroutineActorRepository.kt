package com.netflixdgsspring.repository

import com.netflixdgsspring.entity.Actor
import org.springframework.data.repository.kotlin.CoroutineCrudRepository


interface CoroutineActorRepository : CoroutineCrudRepository<Actor, Long>