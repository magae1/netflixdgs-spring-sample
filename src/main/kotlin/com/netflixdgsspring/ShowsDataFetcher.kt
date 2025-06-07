package com.netflixdgsspring

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment
import com.netflix.graphql.dgs.DgsQuery
import com.netflixdgsspring.codegen.types.Director
import com.netflixdgsspring.codegen.types.Show
import com.netflixdgsspring.service.ShowService
import org.slf4j.LoggerFactory


@DgsComponent
class ShowsDataFetcher(private val showService: ShowService) {
    private val logger = LoggerFactory.getLogger(ShowsDataFetcher::class.java)

    @DgsQuery
    suspend fun shows(dfe: DgsDataFetchingEnvironment): List<Show> {
        logger.info("Find all shows")
        return if (dfe.getDfe().selectionSet.contains("director")) {
            showService.finAllShowWithDirector().map { (id, title, director) -> Show(title, if (director != null) Director(director.name) else null) }
        } else {
            showService.findAllShow().map { ( _, title ) -> Show(title) }
        }
    }
}
