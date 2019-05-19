package com.okanaydin.androidmvvmarchitecturesample.base

import androidx.lifecycle.ViewModel
import com.okanaydin.androidmvvmarchitecturesample.injection.component.DaggerViewModelInjector
import com.okanaydin.androidmvvmarchitecturesample.injection.component.ViewModelInjector
import com.okanaydin.androidmvvmarchitecturesample.injection.module.NetworkModule
import com.okanaydin.androidmvvmarchitecturesample.ui.post.PostListViewModel


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 01:34          │
└─────────────────────────────┘
 */
abstract class BaseViewModel: ViewModel(){

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }

}