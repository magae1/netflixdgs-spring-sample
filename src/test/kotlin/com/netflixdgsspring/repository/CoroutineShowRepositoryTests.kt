package com.netflixdgsspring.repository

import com.netflixdgsspring.entity.ShowEntity
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest
import kotlin.test.assertEquals


@DataR2dbcTest
class CoroutineShowRepositoryTests {

    @Autowired
    private lateinit var showRepo: CoroutineShowRepository

    @Test
    @DisplayName("공연 엔티티 삽입")
    fun testInsertShowEntity() = runTest {
        val show = ShowEntity("John's shows 2", 2L)
        val saved = showRepo.save(show)
        assertEquals(show.title, saved.title)
    }

}