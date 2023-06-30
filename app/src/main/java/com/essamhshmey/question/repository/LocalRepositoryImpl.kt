package com.essamhshmey.question.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.essamhshmey.question.model.entity.Person
import com.essamhshmey.question.model.local.PersonDao

class LocalRepositoryImpl(private val personDao: PersonDao):LocalRepository{

    override suspend fun addPerson(person: Person){
        personDao.addPerson(person)
    }
   override val readAllPerson:List<MutableLiveData<Person>> = personDao.getAll()
    override suspend fun getPerson(name:String){
        personDao.getPerson(name)
    }
   override suspend fun insert(person:Person){
        personDao.insertAll(person)
    }

    override suspend fun delete(person: Person) {
        personDao.delete(person)
    }

    override suspend fun deleteall() {}

}