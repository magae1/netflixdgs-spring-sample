package com.netflixdgsspring.adaptor

import com.netflixdgsspring.dto.ShowDTO
import com.netflixdgsspring.entity.ShowEntity


interface ShowPort {
    suspend fun retrieveAllShow(): List<ShowEntity>

    suspend fun retrieveAllShowWithDirector(): List<ShowDTO>
}