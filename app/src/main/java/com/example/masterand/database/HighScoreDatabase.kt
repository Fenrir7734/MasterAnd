package com.example.masterand.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.masterand.database.dao.PlayerDao
import com.example.masterand.database.dao.ScoreDao
import com.example.masterand.database.entity.Player
import com.example.masterand.database.entity.Score

@Database(entities = [Score::class, Player::class], version = 1, exportSchema = false)
abstract class HighScoreDatabase : RoomDatabase() {
    abstract fun playerDao(): PlayerDao
    abstract fun scoreDao(): ScoreDao

    companion object {
        @Volatile
        private var Instance: HighScoreDatabase? = null

        fun getDatabase(context: Context): HighScoreDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    HighScoreDatabase::class.java,
                    "highscore_database"
                ).build().also { Instance = it }
            }
        }
    }
}