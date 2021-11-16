package com.example.lab78.ui.eventlist

import android.app.Application
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import com.example.lab78.data.dataBase.model.EventReminder
import com.example.lab78.ui.common.App
import com.example.lab78.ui.eventdesc.EventDescFragment

class EventVM(application: Application, val eventReminder: EventReminder) : AndroidViewModel(application) {
    fun onClick(){
        val eventDescFragment = EventDescFragment()
        val bundle = Bundle()
        bundle.putInt("ARG_EVENT_ID", eventReminder.id!!)
        eventDescFragment.arguments = bundle
        getApplication<App>().mainRouter.changeMainFragment(eventDescFragment)
    }
}