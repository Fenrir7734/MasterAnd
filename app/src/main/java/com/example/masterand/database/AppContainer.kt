package com.example.masterand.database

import com.example.masterand.database.repository.PlayersRepository
import com.example.masterand.database.repository.ScoresRepository

interface AppContainer {
    val playersRepository: PlayersRepository
    val scoresRepository: ScoresRepository
}