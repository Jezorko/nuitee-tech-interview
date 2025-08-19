package com.example.nuitee_tech_interview.configuration

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import io.github.oshai.kotlinlogging.KotlinLogging.logger
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.testcontainers.containers.MongoDBContainer
import org.testcontainers.containers.wait.strategy.Wait.forListeningPort
import java.time.Duration

private val logger = logger {}

@Configuration
class DatabaseConfiguration {


    @Bean
    fun mongoDbContainer(): MongoDBContainer {
        val container = MongoDBContainer("mongo:7.0.23")
            .also(MongoDBContainer::start)
        container.waitingFor(forListeningPort().withStartupTimeout(Duration.ofSeconds(180L)))
        return container
    }

    @Bean
    fun customizer(container: MongoDBContainer): MongoClientSettingsBuilderCustomizer {
        return MongoClientSettingsBuilderCustomizer { settings: MongoClientSettings.Builder ->
            logger.info { "local db instance connection string is ${container.connectionString}" }
            settings.applyConnectionString(ConnectionString(container.connectionString))
        }
    }


}