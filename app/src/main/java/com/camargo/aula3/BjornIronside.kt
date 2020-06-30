package com.camargo.aula3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_bjorn_ironside.*

class BjornIronside : AppCompatActivity() {

    private lateinit var info_bjorn: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn_ironside)

        if(savedInstanceState != null) {
            this.info_bjorn = savedInstanceState.getString("info", "")
        }
        else {
            this.info_bjorn = ""
        }
        chegada_bjorn.text = this.info_bjorn

        val cheg_bjorn = intent.extras?.getString("nome_chegada")
        chegada_bjorn.text = "VOCÊ CHEGOU AQUI ATRAVÉS DE ${cheg_bjorn}"

        ragnar_bt.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nome_chegada", "BJORN")
            val intent = Intent(this, RagnarLothbrok::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        lagertha_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", "BJORN")
            val intent = Intent(this, Lagertha::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        floki_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", "BJORN")
            val intent = Intent(this, Floki::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        athelstan_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", "BJORN")
            val intent = Intent(this, Athelstan::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        outState.putString("info", this.info_bjorn)
    }
}
