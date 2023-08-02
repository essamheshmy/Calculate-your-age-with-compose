package com.essamheshmy.calculate_your_age_with_mvvm.ui.screens

import android.graphics.fonts.FontStyle
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person
import com.essamheshmy.calculate_your_age_with_mvvm.ui.theme.btnModifier
import com.essamheshmy.calculate_your_age_with_mvvm.ui.theme.textStyle
import com.essamheshmy.calculate_your_age_with_mvvm.viewmodel.CalculateAgeViewModel

@RequiresApi(Build.VERSION_CODES.Q)
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun homeScreen(){
    var viewModel:CalculateAgeViewModel= viewModel()

    var name by rememberSaveable { mutableStateOf("") }
    var age by rememberSaveable { mutableStateOf(0) }
    var namet by rememberSaveable { mutableStateOf("name") }

    var person=Person("name",20)
    var aget by rememberSaveable { mutableStateOf(0) }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Column(
            Modifier.padding(50.dp,50.dp)
        ) {

            Text(
                text = "Your $namet",
                fontSize = 30.sp,
                fontStyle = androidx.compose.ui.text.font.FontStyle(FontStyle.FONT_WEIGHT_BOLD)
            )
            Text(
                text = "Your $aget",
                fontSize = 30.sp,
                fontStyle = androidx.compose.ui.text.font.FontStyle(FontStyle.FONT_WEIGHT_BOLD)
            )
        }

        Column(
            modifier= Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            OutlinedTextField(
                modifier=Modifier.fillMaxWidth(),
                value = name,
                onValueChange ={name=it},
                label = { Text(text = "enter your name")}
            )

            OutlinedTextField(
                modifier= Modifier
                    .padding(vertical = 20.dp)
                    .fillMaxWidth(),
                value = age.toString(),
                onValueChange ={age=it.toInt()},
                label = { Text(text = "enter your name")}
            )

            Button(
                onClick = {
              //viewModel.calculiteAge2("name,age",20)
                   // name=person.name.toString()
                   //person.name.toString()
                  //  person.age!!

                    aget=age
                    namet=name
                },
                modifier= Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                shape = RoundedCornerShape(10.dp)
            )
            { Text(text = "Button with gray background",color = Color.White) }

        }

    }
}