package com.infectedm.visouapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.infectedm.visouapp.databinding.ActivityResumoBinding
import com.infectedm.visouapp.db.ResumoViewModel

class ResumoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResumoBinding
    private lateinit var viewModel: ResumoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_resumo)
        viewModel = ResumoViewModel()

        // Obtenha os dados do resumo da ViewModel compartilhada
        val resumo = viewModel.resumo

        if (resumo != null) {
            // Preencha o layout com os dados do resumo
            binding.textViewDadosObra.text = "Obra: ${resumo.obra}"
            binding.textViewDonoDeObra.text = "Dono de Obra: ${resumo.donoDeObra}"
            binding.textViewEntidadeExecutante.text = "Entidade Executante: ${resumo.entidadeExecutante}"

            val intervenientes = resumo.intervenientes
            val incidencias = resumo.incidencias
            val observacoes = resumo.observacoes

            // Preencha os dados dos intervenientes
            var intervenientesText = ""
            for (interveniente in intervenientes) {
                intervenientesText += "Entidade: ${interveniente.entidade}\n"
                intervenientesText += "Nome: ${interveniente.nome}\n"
                intervenientesText += "Função: ${interveniente.funcao}\n\n"
            }
            binding.textViewIntervenientes.text = intervenientesText

            // Preencha os dados das incidências
            var incidenciasText = ""
            for (incidencia in incidencias) {
                incidenciasText += "Nº: ${incidencia.numero}\n"
                incidenciasText += "Descrição: ${incidencia.descricao}\n"
                incidenciasText += "Observações: ${incidencia.observacoes}\n\n"
            }
            binding.textViewIncidencias.text = incidenciasText

            // Preencha os dados das observações
            binding.textViewObservacoes.text = observacoes.observacoes
        }

        // Configurar o botão "Guardar" para salvar os dados e voltar ao ecrã principal
        binding.buttonGuardar.setOnClickListener {
            // Lógica para guardar os dados e exportar para um arquivo PDF
            // ...

            // Voltar ao ecrã principal
            finish()
        }
    }
}
