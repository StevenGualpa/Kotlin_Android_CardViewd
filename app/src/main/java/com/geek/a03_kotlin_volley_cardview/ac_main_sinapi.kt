package com.geek.a03_kotlin_volley_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ac_main_sinapi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_main_sinapi)
        VisualizaEjemplo_()
    }

    private fun VisualizaEjemplo_()
    {
        val recyclerView_ : RecyclerView =findViewById(R.id.recycler_sinapi)
        val adapter_=customerAdaptersinApi()

        recyclerView_.layoutManager= LinearLayoutManager(this)
        recyclerView_.adapter=adapter_

    }
}