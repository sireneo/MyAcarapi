package com.rac.myacarapi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
           val valor = txt_num.text.toString().toInt()
            var resultado = " "
            if (r_fibonacci.isChecked()) {
                val n = valor
                var A = 0
                var B = 0
                var C = 1
                for (i in 0..n) {
                    resultado = "$resultado $A, "
                    A = C + B
                    C = B
                    B = A
                }
            } else if (r_replicapares.isChecked()) {
                val n = valor
                var a = 1
                var b = 1
                for (i in 1..n) {
                    resultado = "$resultado $a, "
                    if (b < a) {
                        b = b + 1
                    } else {
                        b = 1
                        a++
                    }

                }
            } else if (r_binario.isChecked()) {
                val n = valor
                var a = 1
                var b = 1
                var Le = 1
                for (i in 1..n) {

                    resultado = "$resultado $Le, "
                    if (b < a) {
                        b = b + 1
                    } else {
                        b = 1
                        a++
                        Le = if (Le == 0) {
                            1
                        } else {
                            0
                        }
                    }
                }
            }

            val intent= Intent (this@MainActivity, MainActivity2::class.java)
            val b : Bundle = Bundle()
            b.putString( "datos", resultado)
            intent.putExtras(b)
            startActivity(intent)
        }

    }
}

