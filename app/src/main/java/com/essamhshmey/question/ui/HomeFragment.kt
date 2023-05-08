package com.essamhshmey.question.ui

import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.essamheshmy.CalculateAge.R
import com.essamheshmy.CalculateAge.databinding.FragmentHomeBinding
import com.essamhshmey.question.MainActivity
import com.essamhshmey.question.viewmodel.CalculateAgeViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Calendar


class HomeFragment : Fragment() {
    private val calculateAgeViewmodel: CalculateAgeViewModel by viewModels()
    private lateinit var binding: FragmentHomeBinding
    private lateinit var mNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mNavController=findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculateAgeButton.setOnClickListener{
            val name="kk"//binding.ageEditText.editText.toString()
            val age:String=binding.ageEditText.text.toString()
            if (age !== null){
                calculateAgeViewmodel.calculiteAge(name,age).observe( requireActivity()
                ) { person ->
                    binding.ageTextView.text = "yourage:${person.age}"
                    GlobalScope.launch {
                        // db.personDao().addPerson(Person(0,"essam",2004))
                    }
                }


            }
        }
    }
}