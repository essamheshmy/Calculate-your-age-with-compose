package com.essamheshmy.calculate_your_age_with_mvvm.presentation.scrins.Home_screen

import androidx.lifecycle.ViewModel
import com.essamheshmy.calculate_your_age_with_mvvm.CalculateApplication
import com.heshmy.data.local.PersonDatabase

class PersonViewModel: ViewModel() {
    private var personDatabase= PersonDatabase.getDaoInstance(CalculateApplication.gitApplicationContext())

    val calculateAgeRepository: com.heshmy.data.repository.CalculateAgeRepository =
        com.heshmy.data.repository.CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age:Int): com.heshmy.domen.entity.Person {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }
}