package com.example.myfirstapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { progressUp() }
    }

    public fun progressUp(){
        var x = 1
        while(x < 100){
            x =+ 10
            progressBar.progress = x
            sleep(1000)
        }

    }

}
