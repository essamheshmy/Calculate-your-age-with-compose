package com.essamhshmey.question.repository;

import androidx.lifecycle.MutableLiveData;

import com.essamhshmey.question.model.Person;

public abstract class CalculateAgeRepository {

  abstract MutableLiveData<Person> calculateYourAge(String name, Integer age);

}
