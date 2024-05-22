package com.example.masterand.database

import android.content.Context
import com.example.masterand.database.repository.PlayersRepository
import com.example.masterand.database.repository.ScoresRepository
import com.example.masterand.database.repository.impl.PlayersRepositoryImpl
import com.example.masterand.database.repository.impl.ScoresRepositoryImpl

//class AppDataContainer(private val context: Context) : AppContainer {
//    override val playersRepository: PlayersRepository by lazy {
//        PlayersRepositoryImpl(HighScoreDatabase.getDatabase(context).playerDao())
//    }
//    override val scoresRepository: ScoresRepository by lazy {
//        ScoresRepositoryImpl(HighScoreDatabase.getDatabase(context).scoreDao())
//    }
//}
