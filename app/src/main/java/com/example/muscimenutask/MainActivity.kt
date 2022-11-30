package com.example.muscimenutask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    override fun onCreateOptionsMenu(
        menu: Menu
    ) : Boolean{

        val inflator = menuInflater.inflate(R.menu.mainmenu,menu)
        return true
    }




}