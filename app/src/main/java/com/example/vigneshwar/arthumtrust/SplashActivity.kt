package com.example.vigneshwar.arthumtrust

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.lang.Exception

class SplashActivity : AppCompatActivity() {

    //For splash screen


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)


        val background = object : Thread(){

            override fun run() {
                try {
                    Thread.sleep(5000) // calling mainactivity after 5 seconds
                    val intent = Intent(baseContext,MainActivity::class.java)
                    startActivity(intent)
                }catch(e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    background.start()

    }}