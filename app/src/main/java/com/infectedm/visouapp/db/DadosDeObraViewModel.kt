package com.infectedm.visouapp.db

import androidx.lifecycle.ViewModel
import com.infectedm.visouapp.db.Obra

class DadosDeObraViewModel : ViewModel() {
    private lateinit var obra: Obra

    fun setDadosObra(obra: Obra) {
        this.obra = obra
    }

    fun getDadosObra(): Obra {
        return obra
    }

    fun onNextClicked() {
        // Lógica para processar os dados da obra e navegar para a próxima atividade
        // ...
    }
}
