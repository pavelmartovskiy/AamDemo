package com.pm.aamdemo.common.auth

import android.app.Service
import android.content.Intent
import android.os.IBinder


class DemoAuthenticatorService : Service() {
  override fun onBind(intent: Intent?): IBinder? {
    return DemoAuthenticator(this).iBinder
  }
}