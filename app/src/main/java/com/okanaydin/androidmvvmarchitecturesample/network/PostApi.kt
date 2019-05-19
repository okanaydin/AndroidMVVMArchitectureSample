package com.okanaydin.androidmvvmarchitecturesample.network

import com.okanaydin.androidmvvmarchitecturesample.model.Post
import retrofit2.http.GET
import io.reactivex.Observable

/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 01:42          │
└─────────────────────────────┘
 */

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}