package com.fsg.fichausuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var usuario: EditText = findViewById(R.id.editTextUsuario)
    private var contraseña: EditText = findViewById(R.id.editTextContraseña)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun botonLogin(view: View) {
        var ficha = Intent(this, FichaActivity::class.java)
        ficha.putExtra("Login","Usuario")

        if (usuario.equals("Usuario") && contraseña.equals("Usuario1")){
            startActivity(ficha)
        }else{
            Toast.makeText(this, "Los credenciales no son validos.", Toast.LENGTH_SHORT).show()
        }
    }
    fun botonSalir(view: View) {
        finish()
    }
}