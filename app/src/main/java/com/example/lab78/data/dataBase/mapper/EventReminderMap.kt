package com.example.lab78.data.dataBase.mapper

import com.example.lab78.data.dataBase.model.EventReminderDb
import com.example.lab78.data.dataBase.model.EventReminder

fun EventReminder.mapToDb() = with(this) {
    EventReminderDb(id, title, desc, dateStart)
}