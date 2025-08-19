package com.example.nuitee_tech_interview

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Profile
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.CLASS

@Retention(RUNTIME)
@Target(CLASS)
@SpringBootTest
@Profile("INTEGRATION_TEST")
annotation class IntegrationTest
