package com.example.faddingimage_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var switch:Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fadeAction(view: View) {
        Log.d("Info", " ImageView tapped")

        var imageViewApel: ImageView = findViewById(R.id.idApel)
        var imageViewApelHijau: ImageView = findViewById(R.id.idApelHijau)

        if (switch){
            switch = false
            imageViewApel.animate().alpha(0F).setDuration(2000)
            imageViewApelHijau.animate().alpha(1f).setDuration(2000)
        } else{
            switch = true
            imageViewApel.animate().alpha(1F).setDuration(2000)
            imageViewApelHijau.animate().alpha(0f).setDuration(2000)
        }
    }
}
