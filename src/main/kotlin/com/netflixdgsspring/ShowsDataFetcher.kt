package com.netflixdgsspring

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.types.errors.ErrorType
import com.netflixdgsspring.codegen.types.Actor
import com.netflixdgsspring.codegen.types.Show
import graphql.GraphQLError


@DgsComponent
class ShowsDataFetcher {
    private val shows = listOf(
        Show("Stranger Things", listOf(Actor("John"))),
        Show("Ozark"),
        Show("The Crown"),
        Show("Dead to Me"),
        Show("Orange is the New Black", listOf(Actor("Bob"))))


    @DgsQuery
    fun shows(): List<Show> {
        val error = GraphQLError.newError().errorType(ErrorType.BAD_REQUEST).message("12344").build()
        return shows
    }


}

