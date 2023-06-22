package com.infectedm.visouapp.db

import android.graphics.Bitmap

data class Incidencia(
    val descricao: String,
    val observacoes: String,
    val foto: Bitmap?
)
