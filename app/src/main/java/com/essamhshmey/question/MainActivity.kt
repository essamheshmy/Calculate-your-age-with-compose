package com.essamhshmey.question


import PersonDatabase
import android.app.Person
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.room.Room
import com.essamheshmy.CalculateAge.R
import com.essamhshmey.question.viewmodel.CalculateAgeViewModel
import com.essamhshmey.question.viewmodel.PersonViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private val personViewModel:PersonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("essam","ntttttttttt")
        GlobalScope.launch {
            var person= com.essamhshmey.question.model.entity.Person("heshmy", 2004)
            var e=personViewModel.addPerson(person)
       }


    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)


    }

}