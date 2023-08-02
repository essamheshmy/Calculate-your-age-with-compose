package com.essamheshmy.calculate_your_age_with_mvvm.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person
import com.essamheshmy.calculate_your_age_with_mvvm.repository.CalculateAgeRepository
import com.essamheshmy.calculate_your_age_with_mvvm.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewModel: ViewModel() {
    private val calculateAgeRepository: CalculateAgeRepository = CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age: Int):Person {
        val person=calculateAgeRepository.calculateYourAge(name,age)
        return person
    }

}