package com.essamhshmey.question.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person_table")
data class Person(
   val name:String,
   val age:Int
)
