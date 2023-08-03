package com.essamheshmy.calculate_your_age_with_mvvm.repository


import androidx.lifecycle.MutableLiveData
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person
import com.essamheshmy.calculate_your_age_with_mvvm.model.local.PersonDao
import java.util.Calendar

class CalculateAgeRepositoryImpl: CalculateAgeRepository {
     override fun calculateYourAge(name: String, age: Int):Person {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge= currentYear - age.toInt()
        val person= Person(name, yourAge)
        return person
    }


}