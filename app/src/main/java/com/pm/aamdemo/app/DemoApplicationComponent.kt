package com.pm.aamdemo.app

import com.pm.aamdemo.common.di.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScope
@Component(modules = [AndroidSupportInjectionModule::class])
interface DemoApplicationComponent : AndroidInjector<DemoApplication> {

  @Component.Builder
  interface Builder {
    @BindsInstance
    fun application(application: DemoApplication): Builder

    fun build(): DemoApplicationComponent
  }
}