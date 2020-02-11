package com.example.myfirstapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener { progressBar1.progress += 10
            if (progressBar1.progress == 100) {progressBar1.progress = 10}}
        button2.setOnClickListener { progressBar2.progress += 10 }
        button3.setOnClickListener { progressBar3.progress += 10 }

    }
    //Написать класс и нормально проинициализировать объекты
    public fun progressUp(){
        var x = 1
        while(x < 100){
            x =+ 10
            progressBar1.progress = x
            sleep(1000)
        }

    }

}

