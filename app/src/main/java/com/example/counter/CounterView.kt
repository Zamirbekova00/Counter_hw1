package com.example.counter

import android.graphics.Color

interface CounterView {
    fun showCount(count:String)
    fun showToast()
    fun changerColor(color: Int)
}