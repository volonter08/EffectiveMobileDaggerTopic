package com.example.core.network.di

import kotlin.properties.Delegates.notNull

object RetrofitDepsStore {
    var deps: RetrofitDeps by notNull()
}