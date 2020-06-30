package com.camargo.aula3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome_chegada: String = getString(R.string.name_main_screen)

        ragnar_bt.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nome_chegada", nome_chegada)
            val intent = Intent(this, RagnarLothbrok::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        lagertha_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", nome_chegada)
            val intent = Intent(this, Lagertha::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        rollo_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", nome_chegada)
            val intent = Intent(this, Rollo::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        floki_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", nome_chegada)
            val intent = Intent(this, Floki::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        athelstan_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", nome_chegada)
            val intent = Intent(this, Athelstan::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        bjorn_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", nome_chegada)
            val intent = Intent(this, BjornIronside::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
