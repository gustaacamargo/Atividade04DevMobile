package com.camargo.aula3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_lagertha.*

class Lagertha : AppCompatActivity() {

    private lateinit var info_lagertha: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)

        if(savedInstanceState != null) {
            this.info_lagertha = savedInstanceState.getString("info", "")
        }
        else {
            this.info_lagertha = ""
        }
        chegada_lagertha.text = this.info_lagertha

        val cheg_lagertha = intent.extras?.getString("nome_chegada")
        val textoChegouAtravesDe: String = getString(R.string.texto_chegou_atraves)
        chegada_lagertha.text = "${textoChegouAtravesDe} ${cheg_lagertha}"

        bjorn_bt.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nome_chegada", "LAGERTHA")
            val intent = Intent(this, BjornIronside::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        ragnar_bt.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nome_chegada", "LAGERTHA")
            val intent = Intent(this, RagnarLothbrok::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)


        outState.putString("info", this.info_lagertha)
    }
}
