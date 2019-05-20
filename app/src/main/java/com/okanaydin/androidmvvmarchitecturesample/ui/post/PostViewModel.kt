package com.okanaydin.androidmvvmarchitecturesample.ui.post

import androidx.lifecycle.MutableLiveData
import com.okanaydin.androidmvvmarchitecturesample.base.BaseViewModel
import com.okanaydin.androidmvvmarchitecturesample.model.Post


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 04:22          │
└─────────────────────────────┘
 */

class PostViewModel:BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}