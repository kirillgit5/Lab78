package com.example.lab78.data.dataBase

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import com.example.lab78.data.dataBase.helpers.TABLE_EVENT_REMINDER
import com.example.lab78.data.dataBase.model.EventReminderDb

@Dao
interface EventReminderDao {
    @Query("SELECT * FROM $TABLE_EVENT_REMINDER")
    fun getAll(): Flow<List<EventReminderDb>>

    @Query("SELECT * FROM $TABLE_EVENT_REMINDER WHERE id == :id")
    fun getById(id: Int): List<EventReminderDb>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(events: List<EventReminderDb>)

    @Delete
    fun remove(eventReminderDb: EventReminderDb)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(eventReminderDb: EventReminderDb)
}