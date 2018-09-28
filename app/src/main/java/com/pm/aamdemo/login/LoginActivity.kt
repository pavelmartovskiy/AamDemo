package com.pm.aamdemo.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pm.aamdemo.R.layout

/**
 * A login screen that offers login via email/password.
 */
class LoginActivity : AppCompatActivity() {
  /**
   * Keep track of the login task to ensure we can cancel it if requested.
   */

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_login) // Set up the login form.
  }


}
