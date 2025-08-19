package com.example.nuitee_tech_interview.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.testcontainers.containers.MongoDBContainer
import org.testcontainers.utility.DockerImageName


@Configuration
class DatabaseConfiguration {

    @Bean
    fun mongodbContainer(): MongoDBContainer {
        return MongoDBContainer(DockerImageName.parse("mongo:4.0.10"))
            .withExposedPorts(27017)
            .withEnv("MONGO_INITDB_ROOT_USERNAME", "admin")
            .withEnv("MONGO_INITDB_ROOT_PASSWORD", "password")
            .withEnv("MONGO_INITDB_DATABASE", "nuitee-tech-interview")
            .also(MongoDBContainer::start)
    }

}