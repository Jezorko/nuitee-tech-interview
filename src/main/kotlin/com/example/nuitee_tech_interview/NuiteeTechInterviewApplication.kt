package com.example.nuitee_tech_interview

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@SpringBootApplication
class NuiteeTechInterviewApplication

fun main(args: Array<String>) {
    runApplication<NuiteeTechInterviewApplication>(*args)
}
