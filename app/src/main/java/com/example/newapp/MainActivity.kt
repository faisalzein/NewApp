package com.example.newapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.Jeniskendaraan

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        val homeFragment = Jeniskendaraan()
        val fragment = fragmentManager.findFragmentByTag(Jeniskendaraan::class.java.simpleName)
        if (fragment !is Jeniskendaraan) {
            Log.d("NewApp", "Fragment Name :" + Jeniskendaraan::class.java.simpleName)
            fragmentManager
                .beginTransaction()
                .add(R.id.frame_container, homeFragment, Jeniskendaraan::class.java.simpleName)
                .commit()
        }
    }
}