package com.netflixdgsspring.repository

import com.netflixdgsspring.entity.ShowEntity
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository


interface CoroutineShowRepository : CoroutineCrudRepository<ShowEntity, Long> {

    @Query(
        """
        SELECT s.id AS id, 
        s.title AS title, 
        d.name AS director_name, 
        d.id AS director_id  
        FROM `show` AS s 
        LEFT JOIN director AS d 
        ON s.director_id = d.id"""
    )
    suspend fun findShowEntitiesWithDirector(): List<ShowDetails>
}