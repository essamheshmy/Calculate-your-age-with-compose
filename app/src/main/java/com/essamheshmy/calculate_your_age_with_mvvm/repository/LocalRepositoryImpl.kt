package com.essamheshmy.calculate_your_age_with_mvvm.repository

import androidx.lifecycle.MutableLiveData
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person
import com.essamheshmy.calculate_your_age_with_mvvm.model.local.PersonDao
import com.essamheshmy.calculate_your_age_with_mvvm.model.local.PersonDatabase

class LocalRepositoryImpl(private val personDao: PersonDao):LocalRepository{

    override suspend fun addPerson(person: Person) { personDao.addPerson(person) }
    override suspend fun getAllPerson():MutableLiveData<Person> = personDao.getAll()
    override suspend fun getItemStream(name: String): Person =personDao.getPerson(name)
    override suspend fun insertPerson(person: Person) =personDao.addPerson(person)
    override suspend fun deletePerson(person: Person) {personDao.delete(person)}
    override suspend fun deleteAll() {personDao.deleteall()}
    override suspend fun updatePerson(person: Person) {personDao.deleteall()}
}