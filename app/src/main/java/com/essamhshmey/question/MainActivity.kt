package com.essamhshmey.question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import com.essamhshmey.question.viewmodel.CalculateAgeViewModel

class MainActivity : AppCompatActivity() {
    lateinit var textViewAge:TextView
    lateinit var editTextName:EditText
    lateinit var editTextAge:EditText
    lateinit var buttonCalculateAge:Button
    private val calculateAgeViewmodel: CalculateAgeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewAge=findViewById(R.id.ageTextView)
        editTextName=findViewById(R.id.editTextText)
        editTextAge=findViewById(R.id.editTextText2)
        buttonCalculateAge=findViewById(R.id.button)

        buttonCalculateAge.setOnClickListener{
            val name=editTextName.text.toString()
            val age:Int=editTextAge.text.toString().toInt()
            calculateAgeViewmodel.calculiteAge(name,age).observe( this,
                {person ->
                textViewAge.text="${person.age.toString()}"
            })


        }

    }
}