package com.essamhshmey.question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import com.essamheshmy.CalculateAge.R
import com.essamhshmey.question.viewmodel.CalculateAgeViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Calendar


class MainActivity : AppCompatActivity() {

   // var db=PersonDatabase.getInstance(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  val db = Room.databaseBuilder(
           applicationContext,
           AppDatabase::class.java, "database-name"
       ).build()
       val userDao = db.userDao()
       val users: List<User> = userDao.getAll()*/


    } }