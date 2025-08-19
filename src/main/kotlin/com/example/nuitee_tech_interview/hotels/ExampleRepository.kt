package com.example.nuitee_tech_interview.hotels

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ExampleRepository : MongoRepository<Example, String> {

    fun findByTest(test: String): Example?

}