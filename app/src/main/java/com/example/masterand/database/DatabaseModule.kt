package com.example.masterand.database

import android.content.Context
import com.example.masterand.database.dao.PlayerDao
import com.example.masterand.database.dao.ScoreDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideHighScoreDatabase(
        @ApplicationContext context: Context
    ): HighScoreDatabase {
        return HighScoreDatabase.getDatabase(context)
    }

    @Provides
    fun providePlayerDao(database: HighScoreDatabase): PlayerDao {
        return database.playerDao()
    }

    @Provides
    fun provideScoreDao(database: HighScoreDatabase): ScoreDao {
        return database.scoreDao()
    }
}