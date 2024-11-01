package com.apellido.nombre.examen2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.apellido.nombre.usolayoutsv4.ActivityEjercicio01Binding

class ejercicio01 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrar.setOnClickListener {
            binding.viewVerde.visibility = View.VISIBLE
        }

        binding.btnOcultar.setOnClickListener {
            binding.viewVerde.visibility = View.GONE
        }
    }
}
