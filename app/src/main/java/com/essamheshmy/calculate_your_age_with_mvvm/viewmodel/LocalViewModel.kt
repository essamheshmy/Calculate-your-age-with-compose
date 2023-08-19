package com.essamheshmy.calculate_your_age_with_mvvm.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.essamheshmy.calculate_your_age_with_mvvm.model.local.PersonDatabase
import com.essamheshmy.calculate_your_age_with_mvvm.repository.LocalRepositoryImpl

class LocalViewModel():ViewModel() {
   var context:Context=CalculateApplication.gitApplicationContext()
    val db by lazy {
        LocalRepositoryImpl(PersonDatabase.getDatabase(context).personDao())
    }


}