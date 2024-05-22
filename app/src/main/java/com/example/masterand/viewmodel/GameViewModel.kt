package com.example.masterand.viewmodel

import androidx.lifecycle.ViewModel
import com.example.masterand.database.entity.Score
import com.example.masterand.database.repository.ScoresRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(private val scoresRepository: ScoresRepository) : ViewModel() {
    suspend fun saveScore(playerId: Long, score: Int) {
        scoresRepository.insertScore(Score(playerId = playerId, score = score))
    }
}