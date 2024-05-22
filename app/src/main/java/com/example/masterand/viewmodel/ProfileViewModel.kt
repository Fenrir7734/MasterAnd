package com.example.masterand.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.masterand.database.entity.Player
import com.example.masterand.database.repository.PlayersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(private val playersRepository: PlayersRepository) : ViewModel() {
    var playerId = mutableStateOf(0L)
    val name = mutableStateOf("")
    val email = mutableStateOf("")

    suspend fun savePlayer() {
        val existingPlayers = playersRepository.getPlayersByEmail(email.value)
        if (existingPlayers.isEmpty()) {
            playerId.value = playersRepository.insertPlayer(Player(name = name.value, email = email.value))
        } else {
            val player = existingPlayers.first()
            playerId.value = player.playerId
            if (player.name != name.value) {
                playersRepository.updatePlayer(player.copy(name = name.value))
            }
        }
    }
}