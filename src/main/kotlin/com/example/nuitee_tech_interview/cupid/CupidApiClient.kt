package com.example.nuitee_tech_interview.cupid

import com.example.nuitee_tech_interview.cupid.CupidApiConfiguration.CupidApiProperties
import org.springframework.http.HttpHeaders
import org.springframework.http.RequestEntity.get
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder.fromUriString
import java.util.concurrent.CompletableFuture.completedFuture
import java.util.concurrent.Future


@Component
class CupidApiClient(private val cupidApiProperties: CupidApiProperties, private val restTemplate: RestTemplate) {

    @Async
    fun getHotelById(hotelId: Long): Future<GetHotelResponse> {
        val response = restTemplate.exchange(
            get(
                fromUriString(cupidApiProperties.url)
                    .pathSegment("v3.0", "property", "$hotelId")
                    .toUriString()
            ).header(HttpHeaders.ACCEPT, "application/json")
                .header("x-api-key", cupidApiProperties.key)
                .build(),
            GetHotelResponse::class.java
        )

        return completedFuture(response.body!!)
    }

}