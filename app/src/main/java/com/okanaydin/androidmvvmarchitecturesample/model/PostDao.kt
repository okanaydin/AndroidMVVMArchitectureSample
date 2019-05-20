package com.okanaydin.androidmvvmarchitecturesample.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 04:14          │
└─────────────────────────────┘
 */

@Dao
interface PostDao {
    @get:Query("SELECT * FROM post")
    val all: List<Post>

    @Insert
    fun insertAll(vararg posts: Post)
}