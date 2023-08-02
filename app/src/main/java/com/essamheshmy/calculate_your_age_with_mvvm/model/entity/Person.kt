package com.essamheshmy.calculate_your_age_with_mvvm.model.entity

//@Entity(tableName = "person_table")
data class Person(
    // @PrimaryKey val uid: Int,
  //  @ColumnInfo(name = "person_name")
    val name:String?,
  //  @ColumnInfo(name = "person_age")
    val age:Int?
)