package com.essamhshmey.question


import PersonDatabase
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.room.Room
import com.essamheshmy.CalculateAge.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("essam","ntttttttttt")
        GlobalScope.launch {
       }


    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
        Log.i("essam","tttttttttt")
        val db = Room.databaseBuilder(
            applicationContext,
            PersonDatabase::class.java, "person-database"
        ).build()
        Toast.makeText(this,"tt",Toast.LENGTH_LONG).show()
    }

}