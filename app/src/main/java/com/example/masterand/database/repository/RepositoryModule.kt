package com.example.masterand.database.repository

import com.example.masterand.database.repository.impl.PlayersRepositoryImpl
import com.example.masterand.database.repository.impl.ScoresRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindPlayersRepository(
        playersRepositoryImpl: PlayersRepositoryImpl
    ): PlayersRepository

    @Binds
    abstract fun bindScoresRepository(
        scoresRepositoryImpl: ScoresRepositoryImpl
    ): ScoresRepository
}