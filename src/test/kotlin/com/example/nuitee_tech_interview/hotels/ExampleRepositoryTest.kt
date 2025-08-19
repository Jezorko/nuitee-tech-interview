package com.example.nuitee_tech_interview.hotels

import com.example.nuitee_tech_interview.IntegrationTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

@IntegrationTest
class ExampleRepositoryTest {

    @Autowired
    lateinit var exampleRepository: ExampleRepository

    @Test
    fun `should work`() {
        val exampleEntity = Example("test")
        exampleRepository.save(exampleEntity)
        val result = exampleRepository.findByTest("test")
        assertThat(result).isEqualTo(exampleEntity)
    }

}