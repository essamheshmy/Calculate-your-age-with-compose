package com.essamheshmy.calculate_your_age_with_mvvm.presentation.Home_screen

import android.graphics.fonts.FontStyle
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
fun homeScreen(){

    var viewModel: CalculateAgeViewModel = viewModel()
    var localViewModel:LocalViewModel= viewModel()
    var name by rememberSaveable { mutableStateOf("") }
    var age by rememberSaveable { mutableStateOf(0) }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Column(
            Modifier.padding(50.dp,50.dp)
        ) {

            Text(
                text = "Your name:$name",
                fontSize = 30.sp,
                fontStyle = androidx.compose.ui.text.font.FontStyle(FontStyle.FONT_WEIGHT_BOLD)
            )
            Text(
                text = "Your age:$age",
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
                label = { Text(text = "enter your name")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )

            OutlinedTextField(
                modifier= Modifier
                    .padding(vertical = 20.dp)
                    .fillMaxWidth(),
                value = age.toString(),
                onValueChange ={age=it.toInt()},
                label = { Text(text = "enter your age")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            Button(
                onClick = {
                 //   GlobalScope.launch { localViewModel.db.addPerson(Person("essam",2004)) }

                    var person=viewModel.calculiteAge(name,age)
                    name= person.name.toString()
                    age= person.age!!

                },
                modifier= Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                shape = RoundedCornerShape(10.dp)
            )
            { Text(text = "CalculateAge",color = Color.White) }

        }

    }
}
