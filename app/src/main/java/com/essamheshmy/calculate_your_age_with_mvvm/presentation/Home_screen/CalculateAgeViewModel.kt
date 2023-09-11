package com.essamheshmy.calculate_your_age_with_mvvm.presentation.Home_screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heshmy.domen.entity.Person
import com.heshmy.data.repository.CalculateAgeRepository
import com.heshmy.data.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewModel: ViewModel() {
    val calculateAgeRepository: com.heshmy.data.repository.CalculateAgeRepository =
        com.heshmy.data.repository.CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age:Int): com.heshmy.domen.entity.Person {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }
}