package com.example.feature_home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.network.api.ApiServer
import com.example.core.network.di.FirstServer
import com.example.core.network.di.NetworkComponent
import com.example.core.network.di.RetrofitDepsStore
import com.example.core.network.di.SecondServer
import com.example.feature_home.di.DaggerFeatureHomeComponent
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import javax.inject.Inject

class FeatureHomeViewModel:ViewModel() {
    init {
        DaggerFeatureHomeComponent.builder().deps(RetrofitDepsStore.deps).build().inject(this)
    }
    @Inject
    @FirstServer
    lateinit var retrofitForServer1: Retrofit
    @Inject
    @SecondServer
    lateinit var retrofitForServer2: Retrofit
    private val apiFirstServer: ApiServer by lazy {
        retrofitForServer1.create(ApiServer::class.java)
    }
    private val apiSecondServer: ApiServer by lazy {
        retrofitForServer2.create(ApiServer::class.java)
    }
    fun getData(){
       viewModelScope.launch {
           apiFirstServer.getData()
           apiSecondServer.getData()
       }
    }
}