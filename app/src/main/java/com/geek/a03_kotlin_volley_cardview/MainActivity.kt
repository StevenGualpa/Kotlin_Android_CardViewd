package com.geek.a03_kotlin_volley_cardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activaapi()
        activatesinapi()
    }

    private fun activatesinapi()
    {
        var btn:Button=findViewById(R.id.btn_ejemplo)
        btn.setOnClickListener{
            val  intent_=Intent(this,ac_main_sinapi::class.java)
            startActivity(intent_)
        }

    }

    private fun activaapi()
    {
        var boton: Button =findViewById(R.id.btn_api)
        boton.setOnClickListener{
            val intent= Intent(this,ac_main_api::class.java)
            startActivity(intent)
        }
    }
}