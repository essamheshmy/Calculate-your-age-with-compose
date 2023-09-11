package com.essamheshmy.calculate_your_age_with_mvvm.presentation.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val btnModifier= Modifier
    .fillMaxWidth()
    .height(80.dp)
  //  .background(
    //    color = Color(0xFFF44336),
       // shape = RoundedCornerShape(size = 8.dp))

val textStyle= androidx.compose.ui.text.TextStyle(
    fontSize = 14.sp,
    lineHeight = 24.sp,
    //fontFamily = FontFamily(Font(R.font.alexandria)),
    fontWeight = FontWeight(400),
    color = Color(0xFFFCFDFE),
    textAlign = TextAlign.Right,
)