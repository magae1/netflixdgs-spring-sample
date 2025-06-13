package com.netflixdgsspring.service

import com.netflixdgsspring.adaptor.ShowAdaptor
import com.netflixdgsspring.dto.ShowDTO
import org.springframework.stereotype.Service


@Service
class ShowService(private val showAdaptor: ShowAdaptor) : ShowUseCase {

    override suspend fun findAllShow(): List<ShowDTO> {
        return showAdaptor.retrieveAllShow().map { (title, _, id) -> ShowDTO(id, title) }
    }

    override suspend fun finAllShowWithDirector(): List<ShowDTO> {
        return showAdaptor.retrieveAllShowWithDirector()
    }

}