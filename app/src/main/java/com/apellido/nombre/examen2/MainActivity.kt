package com.apellido.nombre.usolayoutsv4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Ejercicio02 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etProductos = findViewById<EditText>(R.id.etProductos)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val btnLlamar = findViewById<Button>(R.id.btnLlamar)
        val btnWhatsApp = findViewById<Button>(R.id.btnWhatsApp)
        val btnMaps = findViewById<Button>(R.id.btnMaps)

        // Botón Registrar
        btnRegistrar.setOnClickListener {
            if (etNombre.text.isEmpty() || etProductos.text.isEmpty() || etDireccion.text.isEmpty()) {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                // Redirige a una nueva actividad o muestra un mensaje
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()
            }
        }

        // Botón Llamar
        btnLlamar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:")
            startActivity(intent)
        }

        // Botón WhatsApp
        btnWhatsApp.setOnClickListener {
            val nombre = etNombre.text.toString()
            val productos = etProductos.text.toString()
            val direccion = etDireccion.text.toString()
            val mensaje = "Hola $nombre, tus productos: $productos están en camino a la dirección: $direccion"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/?text=$mensaje")
            startActivity(intent)
        }

        // Botón Maps
        btnMaps.setOnClickListener {
            val direccion = etDireccion.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=$direccion"))
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}
