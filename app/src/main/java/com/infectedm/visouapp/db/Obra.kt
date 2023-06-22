package com.infectedm.visouapp.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Obra(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val obra: String,
    val donoDeObra: String,
    val entidadeExecutante: String
)
