package com.essamhshmey.question.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person_table")
data class Person(

   @ColumnInfo(name = "person_name")
   val name:String,
   val age:Int
)
