package com.example.feature_home.di

import com.example.core.network.di.RetrofitDeps
import com.example.feature_home.FeatureHomeViewModel
import dagger.Component

@Component(dependencies = [RetrofitDeps::class])
interface FeatureHomeComponent {
   @Component.Builder
   interface Builder{
       fun deps(deps: RetrofitDeps):Builder
       fun build():FeatureHomeComponent
   }
    fun inject(homeViewModel: FeatureHomeViewModel)
}