package com.example.core.network.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
class RetrofitModule {
    @Singleton
    @Provides
    @FirstServer
    fun provideRetrofitFirstServer(): Retrofit =
        Retrofit.Builder().baseUrl("").build()
    @Singleton
    @Provides
    @SecondServer
    fun provideRetrofitSecondServer(): Retrofit =
        Retrofit.Builder().baseUrl("").build()
}

@Qualifier
annotation class FirstServer

@Qualifier
annotation class SecondServer