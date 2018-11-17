package com.example.quarter.di

import com.example.quarter.data.GreetingRepositoryImpl
import com.example.quarter.domain.GreetingRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoriesModule {

    @Binds
    fun greetingRepository(repository: GreetingRepositoryImpl): GreetingRepository
}
