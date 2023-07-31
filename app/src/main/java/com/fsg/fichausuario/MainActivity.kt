package com.fsg.fichausuario

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences = getSharedPreferences("Datos", Context.MODE_PRIVATE)
        if (sharedPreferences.contains("Login")){
            var nombreUsuario = sharedPreferences.getString("Login", "")
            var ficha = Intent(this, FichaActivity::class.java)
            ficha.putExtra("Login", nombreUsuario)
            startActivity(ficha)
        }
    }
    fun botonLogin(view: View) {
        var usuario: EditText = findViewById(R.id.editTextUsuario)
        var contrasenia: EditText = findViewById(R.id.editTextContraseña)
        var usuarioS = usuario.text.toString()
        var contraseniaS = contrasenia.text.toString()

        if (contraseniaS.equals((usuarioS + "1"))){

            var editor = sharedPreferences.edit()
            editor.putString("Login", usuarioS)
            editor.commit()

            var ficha = Intent(this, FichaActivity::class.java)
            ficha.putExtra("Login", usuario.text.toString())
            startActivity(ficha)
        } else {
            Toast.makeText(this, "Los credenciales no son validos.", Toast.LENGTH_SHORT).show()
        }
    }

    fun botonSalir(view: View) {
        finish()
    }
}