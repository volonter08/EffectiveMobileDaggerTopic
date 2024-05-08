package com.example.core.network.api

import retrofit2.Response
import retrofit2.http.GET

interface ApiServer {
    @GET("")
    fun getData():Response<String>
}