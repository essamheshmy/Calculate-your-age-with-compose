package com.essamheshmy.calculate_your_age_with_mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person
import com.essamheshmy.calculate_your_age_with_mvvm.repository.CalculateAgeRepository
import com.essamheshmy.calculate_your_age_with_mvvm.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewModel: ViewModel() {
    val calculateAgeRepository: CalculateAgeRepository = CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age:Int): Person {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }
}