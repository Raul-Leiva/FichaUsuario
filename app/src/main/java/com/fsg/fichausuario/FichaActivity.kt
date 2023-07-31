package com.fsg.fichausuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class FichaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ficha)
        var nombre = intent.getStringExtra("Login").toString()
        if (nombre!=null){
            var editTextNombre: EditText = findViewById(R.id.editTextNombre)
            editTextNombre.setText(nombre)
        }
    }
    fun botonGuardar(view: View){

    }
    fun botonAtras(view: View){
        finish()
    }
}