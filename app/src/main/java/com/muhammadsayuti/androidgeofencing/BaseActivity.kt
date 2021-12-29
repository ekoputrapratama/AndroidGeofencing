package com.muhammadsayuti.androidgeofencing

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    fun getRepository() = (application as AndroidGeofencingApp).getRepository()
}