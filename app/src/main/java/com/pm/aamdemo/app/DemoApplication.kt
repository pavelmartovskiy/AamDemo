package com.pm.aamdemo.app

import dagger.android.support.DaggerApplication


class DemoApplication : DaggerApplication() {
  override fun applicationInjector() = DaggerDemoApplicationComponent
      .builder()
      .application(this)
      .build()

}