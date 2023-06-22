package com.infectedm.visouapp.db

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.lifecycle.ViewModel

class IntervenientesViewModel : ViewModel() {
    val intervenientes: ObservableList<Interveniente> = ObservableArrayList()

    init {
        // Adicionar o primeiro interveniente inicialmente
        addInterveniente()
    }

    fun addInterveniente() {
        intervenientes.add(Interveniente("", "", ""))
    }

    fun removeInterveniente(index: Int) {
        intervenientes.removeAt(index)
    }

    fun navigateToIncidencias() {
        // Navegar para a atividade IncidenciasActivity
    }
}
