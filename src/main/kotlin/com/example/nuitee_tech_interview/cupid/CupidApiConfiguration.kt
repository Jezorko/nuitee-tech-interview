package com.example.nuitee_tech_interview.cupid

import com.example.nuitee_tech_interview.cupid.CupidApiConfiguration.CupidApiProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(CupidApiProperties::class)
class CupidApiConfiguration {

    @ConfigurationProperties(prefix = "cupid.api")
    class CupidApiProperties(
        val url: String,
        val key: String
    )

}