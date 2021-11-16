package com.example.lab78.data.dataBase.model

import java.util.*

data class EventReminder(
    val id: Int?,
    val title: String,
    val desc: String,
    val dateStart: Date
){
    companion object {
        fun emptyEventReminder() = EventReminder(null, "", "", Date())
    }
}
