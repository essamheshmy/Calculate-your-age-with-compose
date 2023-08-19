package com.essamheshmy.calculate_your_age_with_mvvm.viewmodel

import android.app.Application
import android.content.Context

class CalculateApplication: Application() {
    init {
        application=this
    }
    companion object{
        private  lateinit var application: CalculateApplication
        fun gitApplicationContext():Context= application.applicationContext
    }
}