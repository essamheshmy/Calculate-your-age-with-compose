package com.essamheshmy.calculate_your_age_with_mvvm.presentation

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.essamheshmy.calculate_your_age_with_mvvm.presentation.Home_screen.homeScreen
import com.essamheshmy.calculate_your_age_with_mvvm.presentation.theme.CalculateyouragewithMVVMTheme

class MainActivity : ComponentActivity() {

    //val db by lazy { LocalRepositoryImpl(PersonDatabase.getDatabase(context = this).personDao()) }
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            CalculateyouragewithMVVMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    homeScreen()

                }
            }
        }
    }
}



