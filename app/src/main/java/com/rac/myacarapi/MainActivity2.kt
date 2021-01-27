package com.rac.myacarapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent: Intent =intent
        val valores = intent.getStringExtra("datos")
        txt_resultado.text = "Su serie  es: $valores"


        button2.setOnClickListener {
            val intent= Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)

        }


    }
}