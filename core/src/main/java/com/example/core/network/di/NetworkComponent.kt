package com.example.core.network.di

import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Component(modules = [RetrofitModule::class])
@Singleton
interface NetworkComponent :RetrofitDeps {
}