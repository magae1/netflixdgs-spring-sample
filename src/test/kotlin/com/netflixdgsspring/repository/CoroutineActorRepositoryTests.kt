package com.netflixdgsspring.repository

import com.netflixdgsspring.entity.Actor
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest
import kotlin.test.assertEquals


@DataR2dbcTest
class CoroutineActorRepositoryTests {

    @Autowired
    private lateinit var actorRepo: CoroutineActorRepository

    @Test
    @DisplayName("배우 엔티티 삽입")
    fun testInsertActor() = runTest {
        val actor = Actor("John")
        val saved: Actor = actorRepo.save(actor)
        assertEquals(actor.name, saved.name)
    }

}