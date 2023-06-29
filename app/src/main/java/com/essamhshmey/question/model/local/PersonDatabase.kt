import androidx.room.Database
import androidx.room.RoomDatabase
import com.essamhshmey.question.model.entity.Person
import com.essamhshmey.question.model.local.PersonDao

@Database(entities = [Person::class], version = 1)
abstract class PersonDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
}