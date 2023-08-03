package com.essamheshmy.calculate_your_age_with_mvvm.repository

import androidx.lifecycle.MutableLiveData
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person

interface LocalRepository {
   suspend fun addPerson(person: Person)
   suspend fun getAllPerson(): MutableLiveData<Person>
   suspend fun getItemStream(name: String): Person

    suspend fun insertPerson(person: Person)


    suspend fun deletePerson(person: Person)
    suspend fun deleteAll()

    suspend fun updatePerson(person: Person)
}