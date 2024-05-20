package com.example.masterand.database.repository

import com.example.masterand.database.entity.Score
import com.example.masterand.database.model.PlayerWithScore
import kotlinx.coroutines.flow.Flow

interface ScoresRepository {
    fun getAllScoresWithPlayerNames(): Flow<List<PlayerWithScore>>
    suspend fun insertScore(score: Score): Long
}