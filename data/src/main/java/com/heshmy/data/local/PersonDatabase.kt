package com.heshmy.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.heshmy.domen.entity.Person

@Database(entities = [Person::class], version = 1, exportSchema = false)
abstract class PersonDatabase:RoomDatabase(){
    abstract fun personDao(): PersonDao
    companion object {
        @Volatile
        private var Instance: PersonDatabase? = null
        private var daoInstant:PersonDao? =null
        fun buildDatabase(context: Context): PersonDatabase {

            return Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    PersonDatabase::class.java,
                    "person_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also {
                        Instance = it
                    }
            }
        }


    fun getDaoInstance(context: Context):PersonDao{
        synchronized(this){
        if (daoInstant==null){
            daoInstant = buildDatabase(context).personDao()
        }
        return daoInstant as PersonDao }
    }
}
}