package com.muhammadsayuti.androidgeofencing

import android.app.Application

class AndroidGeofencingApp : Application() {

    private lateinit var repository: ReminderRepository

    override fun onCreate() {
        super.onCreate()
        repository = ReminderRepository(this)
    }

    fun getRepository() = repository
}