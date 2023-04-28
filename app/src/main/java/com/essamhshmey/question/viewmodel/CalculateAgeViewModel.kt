package com.essamhshmey.question.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.essamhshmey.question.model.entity.Person
import com.essamhshmey.question.repository.CalculateAgeRepository
import com.essamhshmey.question.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewModel:ViewModel() {
    val calculateAgeRepository: CalculateAgeRepository = CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age: Int): MutableLiveData<Person> {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }
}