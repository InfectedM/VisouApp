package com.infectedm.visouapp.db

import androidx.lifecycle.ViewModel

class ResumoViewModel : ViewModel() {
    lateinit var dadosObra: Obra
    lateinit var intervenientes: List<Interveniente>
    lateinit var incidencias: List<Incidencia>
    lateinit var observacoes: Observacoes
}
