package com.essamhshmey.question.model.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.essamhshmey.question.model.entity.Person


@Database(entities = [Person::class], version =1, exportSchema = false)
abstract class PersonDatabase: RoomDatabase(){
    abstract fun personDAO():PersonDAO
    companion object{

        @Volatile private var instance:PersonDatabase? = null
        fun getInstance(context: Context):PersonDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context)
                    .also {
                        instance = it
                    }
            }
        }
        private fun buildDatabase(context: Context):PersonDatabase {
            return Room.databaseBuilder(
                context,
                PersonDatabase::class.java,
                "Person_db")
                .build()
        }
    }

}