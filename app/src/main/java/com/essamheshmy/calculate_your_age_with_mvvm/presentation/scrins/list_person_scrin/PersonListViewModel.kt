package com.essamheshmy.calculate_your_age_with_mvvm.presentation.scrins.list_person_scrin

import androidx.lifecycle.ViewModel
import com.heshmy.data.local.PersonDao

class PersonListViewModel: ViewModel() {
    val personList: com.heshmy.data.repository.LocalRepository =
        com.heshmy.data.repository.LocalRepositoryImpl(PersonDao)
}