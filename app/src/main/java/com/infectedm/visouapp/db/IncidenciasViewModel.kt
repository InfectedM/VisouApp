package com.infectedm.visouapp.db

import android.graphics.drawable.Drawable
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.lifecycle.ViewModel

class IncidenciasViewModel : ViewModel() {
    val incidencias: ObservableList<Incidencia> = ObservableArrayList()

    init {
        // Adicionar a primeira incidência inicialmente
        adicionarIncidencia()
    }

    fun adicionarIncidencia() {
        incidencias.add(Incidencia("", "", null))
    }

    fun removerIncidencia(incidencia: Incidencia) {
        incidencias.remove(incidencia)
    }

    fun tirarFoto(incidencia: Incidencia) {
        // Lógica para tirar uma foto
    }

    fun getFotoDrawable(incidencia: Incidencia): Drawable? {
        // Lógica para obter o drawable da foto
        return null
    }

    fun mostrarFoto(incidencia: Incidencia): Int {
        // Lógica para controlar a visibilidade da foto
        return 0
    }

    fun navegarParaObservacoes() {
        // Navegar para a atividade ObservacoesActivity
    }
}
