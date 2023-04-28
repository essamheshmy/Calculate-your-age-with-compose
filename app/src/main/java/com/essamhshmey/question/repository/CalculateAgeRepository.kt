package com.essamhshmey.question.repository

import androidx.lifecycle.MutableLiveData
import com.essamhshmey.question.model.Person

interface CalculateAgeRepository {
  fun calculateYourAge(name: String, age: Int): MutableLiveData<Person>
}