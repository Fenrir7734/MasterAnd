package com.example.masterand.viewmodel

import androidx.lifecycle.ViewModel
import com.example.masterand.database.model.PlayerWithScore
import com.example.masterand.database.repository.ScoresRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor(private val scoresRepository: ScoresRepository) : ViewModel() {
    val scores: Flow<List<PlayerWithScore>> = scoresRepository.getAllScoresWithPlayerNames()
}