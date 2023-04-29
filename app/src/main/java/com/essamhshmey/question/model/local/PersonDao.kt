package com.essamhshmey.question.model.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.essamhshmey.question.model.entity.Person

@Dao
interface PersonDao {
    @Insert//(onConflict = OnConflictStrategy.REPLACE)
   suspend fun addPerson(vararg  person: Person)
    @Query("SELECT * FROM person_table")
    fun getAll(): List<Person>

    @Query("SELECT * FROM person_table WHERE person_name = :name")
    fun getPerson(name:String):  Person

}