package com.okanaydin.androidmvvmarchitecturesample.injection.component

import com.okanaydin.androidmvvmarchitecturesample.injection.module.NetworkModule
import com.okanaydin.androidmvvmarchitecturesample.ui.post.PostListViewModel
import dagger.Component
import javax.inject.Singleton


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 02:06          │
└─────────────────────────────┘
 */

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}