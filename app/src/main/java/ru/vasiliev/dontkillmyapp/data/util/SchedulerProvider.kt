package ru.vasiliev.dontkillmyapp.data.util

import io.reactivex.rxjava3.core.Scheduler

interface SchedulerProvider {
  fun computation(): Scheduler
  fun io(): Scheduler
  fun ui(): Scheduler
}