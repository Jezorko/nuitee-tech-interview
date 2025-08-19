package com.example.nuitee_tech_interview.hotels

import com.example.nuitee_tech_interview.cupid.CupidApiClient
import com.example.nuitee_tech_interview.cupid.GetHotelResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hotels")
class HotelsController(private val apiClient: CupidApiClient) {

    @GetMapping("/{hotelId}")
    fun getHotelById(@PathVariable hotelId: Long): GetHotelResponse {
        return apiClient.getHotelById(hotelId).get()
    }

}