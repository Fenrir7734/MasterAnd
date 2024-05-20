package com.example.masterand.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.masterand.MasterAndApplication

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            ProfileViewModel(masterAndApplication().container.playersRepository)
        }
        initializer {
            GameViewModel(masterAndApplication().container.scoresRepository)
        }
        initializer {
            ResultViewModel(masterAndApplication().container.scoresRepository)
        }
    }
}

fun CreationExtras.masterAndApplication(): MasterAndApplication = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MasterAndApplication)