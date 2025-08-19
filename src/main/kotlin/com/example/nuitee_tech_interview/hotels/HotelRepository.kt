package com.example.nuitee_tech_interview.hotels

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface HotelRepository : MongoRepository<Map<String, Object>, String>