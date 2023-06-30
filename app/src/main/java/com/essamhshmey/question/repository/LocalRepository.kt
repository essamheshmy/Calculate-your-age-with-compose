package com.essamhshmey.question.repository

import androidx.lifecycle.MutableLiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.essamhshmey.question.model.entity.Person

interface LocalRepository {
    suspend fun addPerson(person: Person)
    val readAllPerson:List<MutableLiveData<Person>>
    suspend fun getPerson(name:String)
    suspend fun insert(person:Person)
    suspend   fun delete(person: Person)
    suspend  fun deleteall()
}