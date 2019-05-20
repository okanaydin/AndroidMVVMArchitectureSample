package com.okanaydin.androidmvvmarchitecturesample.utils.extension

import android.content.ContextWrapper
import android.view.View
import androidx.appcompat.app.AppCompatActivity


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-05-20 - 03:31          │
└─────────────────────────────┘
 */

fun View.getParentActivity(): AppCompatActivity?{
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}