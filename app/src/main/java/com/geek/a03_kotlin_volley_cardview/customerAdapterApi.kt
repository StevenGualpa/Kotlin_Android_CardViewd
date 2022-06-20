package com.geek.a03_kotlin_volley_cardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class customerAdapterApi constructor(context_: Context,
                                     did: List<String>,
                                     dinam: List<String>,
                                     dicorreo: List<String>,
                                     diavatar: List<String>) : RecyclerView.Adapter<customerAdapterApi.ViewHolder>()
{

    val context:Context=context_

    //Creamos los list con valores por defectos para luego cambiarlos con los datos de la Api
    val datos_id = did
    val datos_name = dinam
    val datos_correo = dicorreo
    var datos_avatar = diavatar

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): customerAdapterApi.ViewHolder{
        val v =
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.card_view_api, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: customerAdapterApi.ViewHolder, i: Int) {
        viewHolder.itemid.text =datos_id.get(i)
        viewHolder.itemname.text = datos_name.get(i)
        viewHolder.itemcorreo.text=datos_correo.get(i)
        viewHolder.itemlink.text=datos_avatar.get(i)
        Glide.with(context).load(datos_avatar.get(i)).
                        placeholder(R.drawable.ic_launcher_foreground).
                        error(R.drawable.ic_launcher_background).
                        into(viewHolder.itemimage)
            // viewHolder.itemimage.setImageResource(images_ejem[i])
    }

    override fun getItemCount(): Int {
        return datos_id.count()
    }







    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var itemimage: ImageView
        var itemid: TextView
        var itemname: TextView
        var itemcorreo: TextView
        var itemlink: TextView
        init {
            itemimage=itemView.findViewById(R.id.geek_item_image_api)
            itemid=itemView.findViewById(R.id.geek_item_id_api)
            itemname=itemView.findViewById(R.id.geek_item_Name_api)
            itemcorreo=itemView.findViewById(R.id.geek_item_correo_api)
            itemlink=itemView.findViewById(R.id.geek_item_link_api)
        }
    }
}
