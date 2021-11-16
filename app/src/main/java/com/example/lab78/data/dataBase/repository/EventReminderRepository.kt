package com.example.lab78.data.dataBase.repository

import kotlinx.coroutines.flow.Flow
import com.example.lab78.data.dataBase.model.EventReminder

interface EventReminderRepository {
    suspend fun getEventReminderList(): Flow<List<EventReminder>>
    suspend fun getEventReminder(id: Int): EventReminder?
    suspend fun removeEventReminder(eventReminder: EventReminder)
    suspend fun saveEventReminder(eventReminder: EventReminder)
}