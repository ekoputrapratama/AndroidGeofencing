package com.muhammadsayuti.androidgeofencing

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class GeofenceBroadcastReceiver : BroadcastReceiver() {
  override fun onReceive(context: Context, intent: Intent) {
    GeofenceJobIntentService.enqueueWork(context, intent)
  }
}