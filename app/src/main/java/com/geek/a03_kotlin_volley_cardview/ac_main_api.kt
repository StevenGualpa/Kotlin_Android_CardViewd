package com.geek.a03_kotlin_volley_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONArray
import org.json.JSONObject

class ac_main_api : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_main_api)
        InvocaJsonimg()
    }

    private fun InvocaJsonimg()
    {
        val txtresul=findViewById<TextView>(R.id.lbl_titulo_api)
        val url="https://reqres.in/api/users"
        //       var cadenasid :String=""
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            { response ->

                var cadena :String=""

                val jsonArray : JSONArray = response.getJSONArray("data")

                var listid = arrayListOf<String>()
                var listnames = arrayListOf<String>()
                var listcorreo = arrayListOf<String>()
                var listavatar = arrayListOf<String>()
                for (i in 0 until jsonArray.length())
                {
                    val jarr : JSONObject =jsonArray.getJSONObject(i)
                    listid.add(jarr.getString("id"))
                    listnames.add(jarr.getString("first_name").toString() + jarr.getString("last_name").toString())
                    listcorreo.add(jarr.getString("email"))
                    listavatar.add(jarr.getString("avatar"))
                    //cadena=cadena+"{ id: $did, \n name: $dname $dlastname, \n email: $demail, \n status: $davatar } \n \n "
                }
                //  txtresul.text=arcad.get(0).toString()
                VisualizaEjemplo2_(listid,listnames,listcorreo,listavatar)
                //txtresul.text=cadena
            },
            Response.ErrorListener { error ->
                error.printStackTrace()
                txtresul.text ="Algo Salio Mal"

            }
        )


        //ttt2.text=txtresul.text
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)



    }


    private fun VisualizaEjemplo2_(list1: List<String>,
                                   lis2: List<String>,
                                   list3: List<String>,
                                   list4: List<String>)
    {
        val recyclerView_ : RecyclerView =findViewById(R.id.recycler_api)
        val adapter_=customerAdapterApi(this, list1,
            lis2, list3,
            list4)

        recyclerView_.layoutManager= LinearLayoutManager(this)
        recyclerView_.adapter=adapter_

    }


}