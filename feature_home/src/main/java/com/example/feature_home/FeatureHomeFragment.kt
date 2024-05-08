package com.example.feature_home

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class FeatureHomeFragment:Fragment() {
    val homeViewModel by viewModels<FeatureHomeViewModel>()
}