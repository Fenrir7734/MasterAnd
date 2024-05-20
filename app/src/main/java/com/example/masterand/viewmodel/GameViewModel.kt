package com.example.masterand.viewmodel

import androidx.lifecycle.ViewModel
import com.example.masterand.database.entity.Score
import com.example.masterand.database.repository.ScoresRepository

class GameViewModel(private val scoresRepository: ScoresRepository) : ViewModel() {
    suspend fun saveScore(playerId: Long, score: Int) {
        scoresRepository.insertScore(Score(playerId = playerId, score = score))
    }
}