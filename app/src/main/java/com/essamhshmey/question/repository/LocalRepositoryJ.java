package com.essamhshmey.question.repository;

import androidx.lifecycle.MutableLiveData;

import com.essamhshmey.question.model.entity.Person;

import java.util.List;

public interface LocalRepositoryJ {
    void addPerson(Person person);
    List<MutableLiveData<Person>> readAllPerson() ;
    Person getPerson(String name);
    void insertAll(Person person);
    void delete(Person person);
    void deleteall();
}
