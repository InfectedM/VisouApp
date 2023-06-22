package com.infectedm.visouapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.infectedm.visouapp.databinding.ActivityIntervenientesBinding
import com.infectedm.visouapp.db.IntervenientesViewModel

class IntervenientesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntervenientesBinding
    private lateinit var viewModel: IntervenientesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_intervenientes)
        viewModel = ViewModelProvider(this).get(IntervenientesViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.buttonNext.setOnClickListener {
            viewModel.navigateToIncidencias()
        }
    }
}