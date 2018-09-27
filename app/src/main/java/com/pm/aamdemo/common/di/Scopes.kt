package com.pm.aamdemo.common.di

import javax.inject.Scope
import kotlin.annotation.AnnotationRetention.RUNTIME


@Scope
@MustBeDocumented
@Retention(RUNTIME)
annotation class ApplicationScope

@Scope
@MustBeDocumented
@Retention(RUNTIME)
annotation class ActivityScope

@Scope
@MustBeDocumented
@Retention(RUNTIME)
annotation class FragmentScope