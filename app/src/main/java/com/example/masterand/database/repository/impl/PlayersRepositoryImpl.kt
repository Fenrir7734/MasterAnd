package com.example.masterand.database.repository.impl

import com.example.masterand.database.dao.PlayerDao
import com.example.masterand.database.entity.Player
import com.example.masterand.database.repository.PlayersRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PlayersRepositoryImpl @Inject constructor(private val playerDao: PlayerDao) : PlayersRepository {
    override fun getPlayerStream(id: Long): Flow<Player?> = playerDao.getPlayerStream(id)
    override suspend fun getPlayersByEmail(email: String): List<Player> = playerDao.getPlayersByEmail(email)
    override suspend fun insertPlayer(player: Player): Long = playerDao.insert(player)
    override suspend fun updatePlayer(player: Player) = playerDao.update(player)
}