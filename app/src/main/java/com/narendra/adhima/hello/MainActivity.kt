package com.narendra.adhima.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





            /*   btnTambah.setOnClickListener {

            val angka1 = txtA.text.toString().toInt()
            val angka2 = txtB.text.toString().toInt()

            var hasil = angka1 + angka2

            tvHasil.text = hasil.toString()



        }

        btnKurang.setOnClickListener {

            val angka1 = txtA.text.toString().toInt()
            val angka2 = txtB.text.toString().toInt()

            var hasil = angka1 - angka2

            tvHasil.text = hasil.toString()



        }

        btnKali.setOnClickListener {

            val angka1 = txtA.text.toString().toInt()
            val angka2 = txtB.text.toString().toInt()

            var hasil = angka1 * angka2

            tvHasil.text = hasil.toString()



        }
        btnBagi.setOnClickListener {

            val angka1 = txtA.text.toString().toFloat()
            val angka2 = txtB.text.toString().toFloat()

            var hasil = angka1 / angka2

            tvHasil.text = hasil.toString()

        }*/

        btnTambah.setOnClickListener {

            proseshitung("tambah")
        }
        btnKurang.setOnClickListener {

            proseshitung("kurang")
        }
        btnKali.setOnClickListener {

            proseshitung("kali")
        }
        btnBagi.setOnClickListener {

            proseshitung("bagi")
        }


        }
    fun proseshitung(key:String) {

        val a = txtA.text.toString().toDouble()
        val b = txtB.text.toString().toDouble()
        var hasil = 0.0

        if (key.equals("tambah")){
            hasil = a + b
        }else if(key.equals("kali")){
            hasil = a * b
        }else if(key.equals("kurang")){
            hasil = a - b
        }else if (key.equals("bagi")){
            hasil = a / b
        }
        tvHasil.text = hasil.toString()


        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key",key)
        intent.putExtra("hasil",hasil)
        startActivity(intent)

    }
}
