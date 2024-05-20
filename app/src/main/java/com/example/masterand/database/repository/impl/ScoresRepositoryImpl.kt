package com.example.masterand.database.repository.impl

import com.example.masterand.database.dao.ScoreDao
import com.example.masterand.database.entity.Score
import com.example.masterand.database.model.PlayerWithScore
import com.example.masterand.database.repository.ScoresRepository
import kotlinx.coroutines.flow.Flow


class ScoresRepositoryImpl(private val scoreDao: ScoreDao) : ScoresRepository {
    override fun getAllScoresWithPlayerNames(): Flow<List<PlayerWithScore>> = scoreDao.getAllScoresWithPlayerNames()
    override suspend fun insertScore(score: Score): Long = scoreDao.insert(score)
}