package com.example.lab78.data.dataBase.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.example.lab78.data.dataBase.AppDatabase
import com.example.lab78.data.dataBase.model.EventReminderDb
import java.util.*

class InitialDataDatabaseWorker(
    context: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        val list = listOf(
            EventReminderDb(1, "Event1", "", Date()),
            EventReminderDb(2, "Event2", "", Date())
        )

        try {
            val database = AppDatabase.getInstance(applicationContext)
            database.eventReminderDao().insertAll(list)
            Result.success()
        } catch (ex: Exception) {
            Result.failure()
        }
    }
}