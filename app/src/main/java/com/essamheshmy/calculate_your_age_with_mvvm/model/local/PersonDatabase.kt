package com.essamheshmy.calculate_your_age_with_mvvm.model.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.essamheshmy.calculate_your_age_with_mvvm.model.entity.Person

@Database(entities = [Person::class], version = 1, exportSchema = false)
abstract class PersonDatabase:RoomDatabase(){
    abstract fun personDao(): PersonDao
    companion object {
        @Volatile
        private var Instance: PersonDatabase? = null

        fun getDatabase(context: Context): PersonDatabase{
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, PersonDatabase::class.java, "person_database")
                    .fallbackToDestructiveMigration().build().also { Instance = it }
            }
        }
    }
}