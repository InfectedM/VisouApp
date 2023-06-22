package com.infectedm.visouapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.infectedm.visouapp.databinding.ActivityDadosdeobraBinding
import com.infectedm.visouapp.db.Obra
import com.infectedm.visouapp.db.DadosDeObraViewModel

class DadosDeObraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDadosdeobraBinding
    private lateinit var viewModel: DadosDeObraViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dadosdeobra)

        viewModel = ViewModelProvider(this).get(DadosDeObraViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.buttonNext.setOnClickListener {
            val obra = Obra(
                0,
                binding.editTextObra.text.toString(),
                binding.editTextDonoDeObra.text.toString(),
                binding.editTextEntidadeExecutante.text.toString()
            )

            viewModel.setDadosObra(obra)
            viewModel.onNextClicked()

            val intent = Intent(this, IntervenientesActivity::class.java)
            startActivity(intent)
        }
    }
}
