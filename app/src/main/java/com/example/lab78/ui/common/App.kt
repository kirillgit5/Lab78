package com.example.lab78.ui.common

import android.app.Application
import com.example.lab78.MainRouter
import com.example.lab78.data.dataBase.AppDatabase
import com.example.lab78.data.dataBase.repository.EventReminderRepositoryDb
import com.example.lab78.data.dataBase.repository.EventReminderRepository

class App : Application() {
    lateinit var mainRouter: MainRouter
    private val appDatabase: AppDatabase by lazy { AppDatabase.getInstance(this) }

    val eventReminderRepository: EventReminderRepository by lazy {
        EventReminderRepositoryDb(appDatabase)
    }

    override fun onCreate() {
        super.onCreate()
    }
}