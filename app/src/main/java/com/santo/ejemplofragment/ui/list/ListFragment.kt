package com.santo.ejemplofragment.ui.list

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.santo.ejemplofragment.R
import com.santo.ejemplofragment.databinding.FragmentListBinding

import com.santo.ejemplofragment.model.Superheroe


class ListFragment : Fragment() {
    private lateinit var listBinding: FragmentListBinding
    private var superheroeList= mutableListOf<Superheroe>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        listBinding = FragmentListBinding.inflate(inflater,container,false)
        val root:View=listBinding.root
        loadSuperheroes()


        val superheroesRecyclerViewAdapter=SuperheroesRecyclerViewAdapter(superheroeList, onItemClicked = {onSuperheroeItemClicked(it)})
        listBinding.superheroesRecyclerView.apply {
            layoutManager= LinearLayoutManager(this@ListFragment.requireContext())
            adapter=superheroesRecyclerViewAdapter
            setHasFixedSize(false)
        }
        return root
    }

    private fun loadSuperheroes() {
        superheroeList.clear()
        var superheroe= Superheroe(
            id = 0,
            name =  resources.getString(R.string.Batmanname),
            alias =resources.getString(R.string.Batman_alias),
            Image = R.drawable.bat,
            Power = resources.getString(R.string.Batman_powre))
        superheroeList.add(superheroe)

        superheroe= Superheroe(
            id = 1,
            name =  resources.getString(R.string.Flash_name),
            alias =resources.getString(R.string.Flash_alias),
            Image = R.drawable.flash,
            Power = resources.getString(R.string.flash_power))
        superheroeList.add(superheroe)

        superheroe= Superheroe(
            id = 2,
            name =  resources.getString(R.string.Superman_name),
            alias =resources.getString(R.string.Superman_alias),
            Image = R.drawable.superman,
            Power = resources.getString(R.string.Supermanpowers))
        superheroeList.add(superheroe)

        superheroe= Superheroe(
            id = 3,
            name =  resources.getString(R.string.Wonderwoman_name),
            alias =resources.getString(R.string.Wonderwoman_alias),
            Image = R.drawable.wonder,
            Power = resources.getString(R.string.Wonderwoman_powers))
        superheroeList.add(superheroe)
    }

    private fun onSuperheroeItemClicked(superheroe: Superheroe) {
        when(superheroe.id){
            0->findNavController().navigate(ListFragmentDirections.actionListFragmentToBatmanFragment())
            1->findNavController().navigate(ListFragmentDirections.actionListFragmentToFlashFragment())
            2->findNavController().navigate(ListFragmentDirections.actionListFragmentToSupermanFragment())
            else->findNavController().navigate(ListFragmentDirections.actionListFragmentToWonderWomnFragament())
        }


    }


}