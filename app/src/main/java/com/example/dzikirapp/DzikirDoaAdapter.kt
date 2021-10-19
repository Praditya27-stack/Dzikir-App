package com.example.dzikirapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

// Untuk menyisipkan semua data dan layout kedalam ReycycleView (sebagai controller)

class DzikirDoaAdapter(private val listDzikirDoa : ArrayList<DzikirDoa>) : RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvLafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvTerjemahan: TextView = itemView.findViewById(R.id.tv_terjemah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDesc.text = listDzikirDoa[position].desc /* Menggunakan parameter untuk memanggil class agar lebih simple dan tidak dua kali kerja */
        holder.tvLafaz.text = listDzikirDoa[position].lafaz
        holder.tvTerjemahan.text = listDzikirDoa[position].terjemah
    }

    override fun getItemCount(): Int {
       return listDzikirDoa.size
    }
}