package com.example

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SWApplication() : Application() {
    companion object {
        const val Token = "ckIblIFfPUfO8Ego"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}