package com.essamheshmy.calculate_your_age_with_mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person
import com.essamheshmy.calculate_your_age_with_mvvm.repository.CalculateAgeRepository
import com.essamheshmy.calculate_your_age_with_mvvm.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewModel: ViewModel() {
    private val calculateAgeRepository: CalculateAgeRepository = CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age: Int): MutableLiveData<Person> {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }

    fun calculiteAge2(name:String, age: Int):Person{
        return Person(name,age)
    }
}