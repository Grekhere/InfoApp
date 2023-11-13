package com.example.infoapp
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ListItem::class],
    version = 1
)
abstract class MainDb : RoomDatabase() {
    abstract val dao: Dao
}