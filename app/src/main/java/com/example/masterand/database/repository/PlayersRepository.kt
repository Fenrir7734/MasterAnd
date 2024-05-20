package com.example.masterand.database.repository

import com.example.masterand.database.entity.Player
import kotlinx.coroutines.flow.Flow

interface PlayersRepository {
    fun getPlayerStream(id: Long): Flow<Player?>
    suspend fun getPlayersByEmail(email: String): List<Player>
    suspend fun insertPlayer(player: Player): Long
    suspend fun updatePlayer(player: Player)
}