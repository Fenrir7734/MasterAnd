package com.example.masterand.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "players")
data class Player(
    @PrimaryKey(autoGenerate = true)
    val playerId: Long = 0,
    val name: String,
    val email: String
)