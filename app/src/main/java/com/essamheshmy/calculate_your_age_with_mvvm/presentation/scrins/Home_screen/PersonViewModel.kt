package com.essamheshmy.calculate_your_age_with_mvvm.presentation.scrins.Home_screen

import androidx.lifecycle.ViewModel

class PersonViewModel: ViewModel() {
    val calculateAgeRepository: com.heshmy.data.repository.CalculateAgeRepository =
        com.heshmy.data.repository.CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age:Int): com.heshmy.domen.entity.Person {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }
}