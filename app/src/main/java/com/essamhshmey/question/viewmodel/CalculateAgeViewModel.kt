package com.essamhshmey.question.viewmodel

import android.text.Editable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.essamhshmey.question.repository.CalculateAgeRepository
import com.essamhshmey.question.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewModel:ViewModel() {
    val calculateAgeRepository: CalculateAgeRepository = CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age: Int): MutableLiveData<com.essamhshmey.question.model.Person> {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }
}