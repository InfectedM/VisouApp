package com.infectedm.visouapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.infectedm.visouapp.databinding.ActivityObservacoesBinding
import com.infectedm.visouapp.db.Resumo

class ObservacoesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityObservacoesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_observacoes)

        binding.buttonConcluir.setOnClickListener {
            val observacoes = binding.editTextObservacoes.text.toString()
            val resumo = Resumo(observacoes)
            // Salvar os dados do resumo ou realizar qualquer outra ação necessária

            // Navegar para a próxima atividade (ResumoActivity)
            val intent = Intent(this, ResumoActivity::class.java)
            startActivity(intent)
        }
    }
}
