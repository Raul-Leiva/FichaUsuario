package com.fsg.fichausuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FichaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ficha)
        var ficha = intent.getStringExtra("Login").toString()

    }
}