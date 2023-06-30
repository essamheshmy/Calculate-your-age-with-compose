package com.essamhshmey.question.viewmodel

import PersonDatabase
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.essamhshmey.question.model.entity.Person
import com.essamhshmey.question.repository.LocalRepository
import com.essamhshmey.question.repository.LocalRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PersonViewModel(application: Application) : AndroidViewModel(application) {
    private val readAllDate: List<MutableLiveData<Person>>
    private val repository: LocalRepositoryImpl
        init {
            val personDao=PersonDatabase.getDatabase(application).personDao()
            repository=LocalRepositoryImpl(personDao)
            readAllDate=repository.readAllPerson
        }


    fun  addPerson(person: Person){
        viewModelScope.launch (Dispatchers.IO){
            repository.addPerson(person)
        }
    }
    fun getPerson(name:String){
        viewModelScope.launch(Dispatchers.IO) {
            repository.getPerson(name)
        }
    }
    fun insertAll(person:Person){
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(person)
        }
    }

    fun delete(person: Person){
        viewModelScope.launch (Dispatchers.IO){
            repository.delete(person)
        }
    }
    fun deleteAll(){
        viewModelScope.launch (Dispatchers.IO){
            repository.deleteall()
        }
    }
}