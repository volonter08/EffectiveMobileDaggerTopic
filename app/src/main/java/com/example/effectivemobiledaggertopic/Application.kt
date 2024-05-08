package com.example.effectivemobiledaggertopic

import android.app.Application
import com.example.core.network.di.DaggerNetworkComponent
import com.example.core.network.di.RetrofitDeps
import com.example.core.network.di.RetrofitDepsStore
import com.example.effectivemobiledaggertopic.di.AppComponent
import com.example.effectivemobiledaggertopic.di.DaggerAppComponent

class MyApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        appComponent = DaggerAppComponent.builder().retrofitDeps(DaggerNetworkComponent.create()).build()
        RetrofitDepsStore.deps = appComponent.retrofitDeps

        super.onCreate()
    }
}