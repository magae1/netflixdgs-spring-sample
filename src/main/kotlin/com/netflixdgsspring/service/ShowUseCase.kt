package com.netflixdgsspring.service

import com.netflixdgsspring.dto.ShowDTO
import com.netflixdgsspring.entity.ShowEntity

interface ShowUseCase {
    suspend fun findAllShow(): List<ShowDTO>
    suspend fun finAllShowWithDirector(): List<ShowDTO>
}