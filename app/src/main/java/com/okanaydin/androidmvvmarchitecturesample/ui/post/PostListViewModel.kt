package com.okanaydin.androidmvvmarchitecturesample.ui.post

import com.okanaydin.androidmvvmarchitecturesample.base.BaseViewModel
import com.okanaydin.androidmvvmarchitecturesample.network.PostApi
import javax.inject.Inject


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 01:59          │
└─────────────────────────────┘
 */

class PostListViewModel: BaseViewModel(){
    @Inject
    lateinit var postApi: PostApi
}