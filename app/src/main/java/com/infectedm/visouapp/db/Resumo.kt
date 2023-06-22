package com.infectedm.visouapp.db

data class Resumo(
    val dadosObra: String,
    val intervenientes: List<Interveniente>,
    val incidencias: List<Incidencia>,
    val observacoes: Observacoes
)
