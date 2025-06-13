package com.netflixdgsspring.service

import com.netflixdgsspring.dto.ShowDTO

interface ShowUseCase {
    suspend fun findAllShow(): List<ShowDTO>
    suspend fun finAllShowWithDirector(): List<ShowDTO>
}