package com.example.masterand.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.masterand.database.entity.Player
import kotlinx.coroutines.flow.Flow

@Dao
interface PlayerDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(player: Player): Long

    @Update
    suspend fun update(player: Player)

    @Query("SELECT * FROM players WHERE playerId = :playerId")
    fun getPlayerStream(playerId: Long): Flow<Player?>

    @Query("SELECT * FROM players WHERE email = :email")
    suspend fun getPlayersByEmail(email: String): List<Player>
}