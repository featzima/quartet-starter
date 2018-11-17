package com.example.quarter.di

import com.example.quarter.App
import dagger.Component
import dagger.android.AndroidInjector

@Component(modules = [
    DaggerAndroidModule::class,
    RepositoriesModule::class
])
interface AppComponent : AndroidInjector<App>