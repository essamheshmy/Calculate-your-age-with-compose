package com.essamheshmy.calculate_your_age_with_mvvm

import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person
import com.essamheshmy.calculate_your_age_with_mvvm.model.local.PersonDatabase
import com.essamheshmy.calculate_your_age_with_mvvm.repository.LocalRepositoryImpl
import com.essamheshmy.calculate_your_age_with_mvvm.ui.screens.homeScreen
import com.essamheshmy.calculate_your_age_with_mvvm.ui.theme.CalculateyouragewithMVVMTheme
import com.essamheshmy.calculate_your_age_with_mvvm.viewmodel.CalculateAgeViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

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



