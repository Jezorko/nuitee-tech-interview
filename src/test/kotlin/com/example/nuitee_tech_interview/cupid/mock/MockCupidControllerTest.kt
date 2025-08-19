package com.example.nuitee_tech_interview.cupid.mock

import com.example.nuitee_tech_interview.IntegrationTest
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

@IntegrationTest
class MockCupidControllerTest {

    @Autowired
    lateinit var mockCupidController: MockCupidController

    @Test
    fun `should load test data`() {
        // given
        val hotelId = 123L

        // when
        val testData = mockCupidController.getHotelById(hotelId)

        // then
        Assertions.assertThat(testData)
            .returns(hotelId) { it.data["hotel_id"] }
            .returns(hotelId) { it.data["cupid_id"] }
    }

}