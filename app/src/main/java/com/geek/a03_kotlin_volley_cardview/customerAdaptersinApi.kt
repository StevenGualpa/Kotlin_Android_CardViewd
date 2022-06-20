package com.geek.a03_kotlin_volley_cardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customerAdaptersinApi: RecyclerView.Adapter<customerAdaptersinApi.ViewHolder>() {
    val titles_ejem = arrayOf(
        "Codelia",
        "Suscribete",
        "Videos", "" +
                "Youtube",
        "Now"
    )
    val detailes_ejem = arrayOf(
        "Muchos videos nuevos",
        "Kotlin",
        "Mas videos",
        "Gran Canridad de Videos",
        "Now"
    )
    val images_ejem = intArrayOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground
    )

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v =
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.card_view_sinapi, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles_ejem[i]
        viewHolder.itemDetail.text = detailes_ejem[i]
        viewHolder.itemImage.setImageResource(images_ejem[i])

    }

    override fun getItemCount(): Int {
        return titles_ejem.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image_sinapi)
            itemTitle = itemView.findViewById(R.id.item_title_sinapi)
            itemDetail = itemView.findViewById(R.id.item_detal_sinapi)
        }
    }
}
