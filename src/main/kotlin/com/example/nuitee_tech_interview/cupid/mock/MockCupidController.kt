package com.example.nuitee_tech_interview.cupid.mock

import com.example.nuitee_tech_interview.cupid.GetHotelResponse
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.core.io.ClassPathResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/cupid-mock")
class MockCupidController(private val objectMapper: ObjectMapper) {

    @GetMapping("/v3.0/property/{hotelId}")
    fun getHotelById(@PathVariable hotelId: Long): GetHotelResponse {
        return loadExampleGetHotelResponse(hotelId)
    }

    private fun loadExampleGetHotelResponse(hotelId: Long): GetHotelResponse {
        val resource = ClassPathResource("mocks/example-get-hotel-response.json")
        val response = objectMapper.readValue(resource.file, GetHotelResponse::class.java)
        response.data["hotel_id"] = hotelId as Object
        response.data["cupid_id"] = hotelId as Object
        return response
    }

}