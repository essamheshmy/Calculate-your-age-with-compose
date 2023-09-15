package com.heshmy.data.repository

import androidx.lifecycle.MutableLiveData
import com.heshmy.data.local.PersonDao
import com.heshmy.data.local.PersonDatabase
import com.heshmy.domen.entity.Person

class LocalRepositoryImpl(private val personDao: com.heshmy.data.local.PersonDao): LocalRepository {

    override suspend fun addPerson(person: Person) { personDao.addPerson(person) }
    override suspend fun getAllPerson():MutableLiveData<Person> = personDao.getAll()
    override suspend fun getItemStream(name: String): Person =personDao.getPerson(name)
    override suspend fun insertPerson(person: Person) =personDao.addPerson(person)
    override suspend fun deletePerson(person: Person) {personDao.delete(person)}
    override suspend fun deleteAll() {personDao.deleteall()}
    override suspend fun updatePerson(person: Person) {personDao.deleteall()}
}