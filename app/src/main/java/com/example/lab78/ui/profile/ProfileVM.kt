package com.example.lab78.ui.profile

import android.app.Application
import androidx.fragment.app.Fragment
import androidx.lifecycle.AndroidViewModel
import com.example.lab78.ui.common.App

class ProfileVM(application: Application) : AndroidViewModel(application) {
    fun changeMainFragment(fragment: Fragment){
        getApplication<App>().mainRouter.changeMainFragment(fragment)
    }
}