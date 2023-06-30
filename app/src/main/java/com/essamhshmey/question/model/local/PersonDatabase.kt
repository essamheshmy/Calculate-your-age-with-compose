import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.essamhshmey.question.model.entity.Person
import com.essamhshmey.question.model.local.PersonDao

@Database(entities = [Person::class], version = 1, exportSchema = false)
abstract class PersonDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
    companion object{
        @Volatile
        private var INSTANCE:PersonDatabase?=null
        fun getDatabase(context: Context):PersonDatabase{
            val tempInstance= INSTANCE
            if(tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                val instant= Room.databaseBuilder(
                    context.applicationContext,
                    PersonDatabase::class.java,
                    "person_database"
                ).build()
                INSTANCE=instant
                return instant
            }
        }
    }
}