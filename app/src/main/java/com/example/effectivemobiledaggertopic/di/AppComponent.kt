package com.example.effectivemobiledaggertopic.di

import com.example.core.network.di.NetworkComponent
import com.example.core.network.di.RetrofitDeps
import dagger.BindsInstance
import dagger.Component
import javax.inject.Scope

@Component(modules = [AppModule::class])
@AppScope
interface AppComponent{
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun retrofitDeps(deps:RetrofitDeps):Builder
        fun build():AppComponent
    }
    val retrofitDeps:RetrofitDeps
}
@Scope
annotation class AppScope
