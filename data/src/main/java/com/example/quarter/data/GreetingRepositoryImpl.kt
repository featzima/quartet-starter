package com.example.quarter.data

import com.example.quarter.domain.GreetingRepository
import javax.inject.Inject

class GreetingRepositoryImpl @Inject constructor() : GreetingRepository {

    override val greetingMessage: String
        get() = "Hello, World"
}