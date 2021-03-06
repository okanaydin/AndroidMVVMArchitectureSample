package com.okanaydin.androidmvvmarchitecturesample.model

import androidx.room.Entity
import androidx.room.PrimaryKey


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 01:36          │
└─────────────────────────────┘
 */

@Entity
data class Post(
    val userId: Int,
    @field:PrimaryKey
    val id: Int,
    val title: String,
    val body: String
)