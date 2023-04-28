package com.essamhshmey.question.repository

import androidx.lifecycle.MutableLiveData
import com.essamhshmey.question.model.entity.Person
import java.util.Calendar

class CalculateAgeRepositoryImpl: CalculateAgeRepository {
    public override fun calculateYourAge(name: String, age: Int): MutableLiveData<Person> {
        val infoMutablLiveData = MutableLiveData<Person>()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge= currentYear - age
        val person= Person(name,yourAge)
        infoMutablLiveData.postValue(person)
        return infoMutablLiveData
    }

}