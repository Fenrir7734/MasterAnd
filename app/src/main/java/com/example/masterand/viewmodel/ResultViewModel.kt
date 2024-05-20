package com.example.masterand.viewmodel

import androidx.lifecycle.ViewModel
import com.example.masterand.database.model.PlayerWithScore
import com.example.masterand.database.repository.ScoresRepository
import kotlinx.coroutines.flow.Flow

class ResultViewModel(private val scoresRepository: ScoresRepository) : ViewModel() {
    val scores: Flow<List<PlayerWithScore>> = scoresRepository.getAllScoresWithPlayerNames()
}