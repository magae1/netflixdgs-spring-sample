package com.netflixdgsspring.repository

import com.netflixdgsspring.entity.DirectorEntity
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest
import kotlin.test.assertEquals


@DataR2dbcTest
class CoroutineDirectorRepositoryTests {

    @Autowired
    private lateinit var directorRepo: CoroutineDirectorRepository

    @Test
    @DisplayName("감독 엔티티 삽입")
    fun testInsertActor() = runTest {
        val director = DirectorEntity("John")
        val saved: DirectorEntity = directorRepo.save(director)
        assertEquals(director.name, saved.name)
    }

}