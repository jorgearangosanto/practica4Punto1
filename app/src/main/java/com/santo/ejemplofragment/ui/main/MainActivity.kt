package com.santo.ejemplofragment.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santo.ejemplofragment.R
import com.santo.ejemplofragment.databinding.ActivityMainBinding
import com.santo.ejemplofragment.ui.batman.BatmanFragment
import com.santo.ejemplofragment.ui.bottom.BottonNavigationActivity
import com.santo.ejemplofragment.ui.masterdetail.MasterDetailActivity
import com.santo.ejemplofragment.ui.navdrawer.NavigationDrawerActivity
import com.santo.ejemplofragment.ui.tabbed.TabbedActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.batmanboton.setOnClickListener {
            val intent = Intent(this,MasterDetailActivity::class.java)
            startActivity(intent)

            mainBinding.flashboton.setOnClickListener {
                val intent = Intent(this,NavigationDrawerActivity::class.java)
                startActivity(intent)
        }
            mainBinding.supermanbotton.setOnClickListener {
                val intent = Intent(this,BottonNavigationActivity::class.java)
                startActivity(intent)
            }
            mainBinding.wonderWomanBoton.setOnClickListener {
                val intent = Intent(this,TabbedActivity::class.java)
                startActivity(intent)
            }





        }
}}