package com.heshmy.data.repository

import androidx.lifecycle.MutableLiveData
import com.heshmy.domen.entity.Person
import java.util.concurrent.Flow


interface CalculateAgeRepository {

    fun calculateYourAge(name: String, age: Int): Person
}