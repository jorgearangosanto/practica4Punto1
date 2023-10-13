package com.santo.ejemplofragment.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.santo.ejemplofragment.R
import com.santo.ejemplofragment.databinding.CardViewItemSuperheroesBinding
import com.santo.ejemplofragment.model.Superheroe

class SuperheroesRecyclerViewAdapter(
    private val superheroesList:MutableList<Superheroe>,
    private val onItemClicked:(Superheroe)-> Unit
):RecyclerView.Adapter<SuperheroesRecyclerViewAdapter.SuperheroeViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroeViewHolder {
        val ItemView= LayoutInflater.from(parent.context).inflate(R.layout.card_view_item_superheroes,parent,false)
        return SuperheroeViewHolder(ItemView)
    }

    override fun getItemCount(): Int = superheroesList.size

    override fun onBindViewHolder(holder: SuperheroeViewHolder, position: Int) {
        val superheroe = superheroesList[position]
        holder.bindSuperheroe(superheroe)
        holder.itemView.setOnClickListener { onItemClicked(superheroe) }

    }

    class SuperheroeViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        private val binding = CardViewItemSuperheroesBinding.bind(itemView)

        fun bindSuperheroe(superheroe: Superheroe){
            with(binding){
                nameTextView5.text=superheroe.name
                superHeroeImageView2.setImageResource(superheroe.Image)
            }
        }
    }
}