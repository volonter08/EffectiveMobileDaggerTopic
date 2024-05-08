package com.example.core.network.di

import retrofit2.Retrofit

interface RetrofitDeps{
    @FirstServer
    fun getFirstServerRetrofit():Retrofit
    @SecondServer
    fun getSecondServerRetrofit():Retrofit
}