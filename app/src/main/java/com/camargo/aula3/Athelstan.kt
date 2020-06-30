package com.camargo.aula3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_athelstan.*

class Athelstan : AppCompatActivity() {

    private lateinit var info_athelstan: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athelstan)

        if(savedInstanceState != null) {
            this.info_athelstan = savedInstanceState.getString("info", "")

        }
        else {
            this.info_athelstan = ""
        }
        chegada_athelstan.text = this.info_athelstan

        val cheg_athelstan = intent.extras?.getString("nome_chegada")
        val textoChegouAtravesDe: String = getString(R.string.texto_chegou_atraves)
        chegada_athelstan.text = "${textoChegouAtravesDe} ${cheg_athelstan}"

        ragnar_bt.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nome_chegada", "ATHELSTAN")
            val intent = Intent(this, RagnarLothbrok::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        bjorn_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", "ATHELSTAN")
            val intent = Intent(this, BjornIronside::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        outState.putString("info", this.info_athelstan)
    }
}
