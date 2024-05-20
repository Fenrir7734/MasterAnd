package com.example.masterand.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.masterand.database.entity.Score
import com.example.masterand.database.model.PlayerWithScore
import kotlinx.coroutines.flow.Flow

@Dao
interface ScoreDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(score: Score): Long

    @Query("SELECT players.name AS playerName, scores.score AS score FROM players INNER JOIN scores ON players.playerId = scores.playerId ORDER BY scores.score ASC")
    fun getAllScoresWithPlayerNames(): Flow<List<PlayerWithScore>>
}