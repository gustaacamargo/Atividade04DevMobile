package com.camargo.aula3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ragnar_lothbrok.*

class RagnarLothbrok : AppCompatActivity() {

    private lateinit var info: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar_lothbrok)

        if (savedInstanceState != null) {
            this.info = savedInstanceState.getString("info", "")
        } else {
            this.info = ""
        }
        tv_chegada.text = this.info

        val nome_chegada = intent.extras?.getString("nome_chegada")
        val textoChegouAtravesDe: String = getString(R.string.texto_chegou_atraves)
        tv_chegada.text = "${textoChegouAtravesDe} ${nome_chegada}"

        lagerta_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", "RAGNAR")
            val intent = Intent(this, Lagertha::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        bjorn_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", "RAGNAR")
            val intent = Intent(this, BjornIronside::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        floki_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", "RAGNAR")
            val intent = Intent(this, Floki::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("info", this.info)
    }
}
