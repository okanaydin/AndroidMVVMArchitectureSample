package com.okanaydin.androidmvvmarchitecturesample.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.okanaydin.androidmvvmarchitecturesample.model.Post
import com.okanaydin.androidmvvmarchitecturesample.model.PostDao


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 04:14          │
└─────────────────────────────┘
 */

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}