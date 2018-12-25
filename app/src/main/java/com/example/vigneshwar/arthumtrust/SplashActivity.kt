package com.myapp.vigneshwar.arthamtrust

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.vigneshwar.arthumtrust.MainActivity
import com.example.vigneshwar.arthumtrust.R
import java.lang.Exception

class SplashActivity : AppCompatActivity() {

    //For splash screen


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)


        val background = object : Thread(){

            override fun run() {
                try {
                    sleep(1000) // calling mainactivity after 1 seconds
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }catch(e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    background.start()

    }}