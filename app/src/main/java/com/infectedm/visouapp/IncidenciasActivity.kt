package com.infectedm.visouapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.infectedm.visouapp.databinding.ActivityIncidenciasBinding
import com.infectedm.visouapp.db.IncidenciasViewModel

class IncidenciasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIncidenciasBinding
    private lateinit var viewModel: IncidenciasViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_incidencias)
        viewModel = ViewModelProvider(this).get(IncidenciasViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.buttonSeguinte.setOnClickListener {
            viewModel.navegarParaObservacoes()
        }
    }
}
