package com.netflixdgsspring.adaptor

import com.netflixdgsspring.dto.DirectorDTO
import com.netflixdgsspring.dto.ShowDTO
import com.netflixdgsspring.entity.ShowEntity
import com.netflixdgsspring.repository.CoroutineShowRepository
import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Component


@Component
class ShowAdaptor (private val showRepository: CoroutineShowRepository) : ShowPort {

    override suspend fun retrieveAllShow(): List<ShowEntity> {
        val res = this.showRepository.findAll()
        return res.toList()
    }

    override suspend fun retrieveAllShowWithDirector(): List<ShowDTO> {
        val res = showRepository.findShowEntitiesWithDirector()
        return res.map { details -> (ShowDTO(details.id, details.title, DirectorDTO(details.directorName) )) }
    }

}