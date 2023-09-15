package com.heshmy.data.repository


import androidx.lifecycle.MutableLiveData
import com.heshmy.data.local.PersonDao
import com.heshmy.domen.entity.Person
import java.util.Calendar

class CalculateAgeRepositoryImpl: CalculateAgeRepository {
     override fun calculateYourAge(name: String, age: Int): Person {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge= currentYear - age.toInt()
        val person= Person(name, yourAge)
        return person
    }


}