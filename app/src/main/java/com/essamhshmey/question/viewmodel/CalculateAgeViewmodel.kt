package com.essamhshmey.question.viewmodel

import androidx.lifecycle.ViewModel
import com.essamhshmey.question.repository.CalculateAgeRepository
import com.essamhshmey.question.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewmodel:ViewModel() {
    val calculateAgeRepository: CalculateAgeRepository = CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String,age:Int){
        calculateAgeRepository.

    }
}