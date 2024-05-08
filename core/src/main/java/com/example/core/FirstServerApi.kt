package com.example.core

import retrofit2.http.GET

interface FirstServerApi {
    @GET("")
    fun getData()
}