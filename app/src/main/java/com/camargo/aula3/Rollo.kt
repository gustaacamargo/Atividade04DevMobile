package com.camargo.aula3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_rollo.*

class Rollo : AppCompatActivity() {

    private lateinit var info_rollo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)

        if(savedInstanceState != null) {
            this.info_rollo = savedInstanceState.getString("info", "")
        }
        else {
            this.info_rollo = ""
        }
        chegada_rollo.text = this.info_rollo

        val cheg_rollo = intent.extras?.getString("nome_chegada")
        val textoChegouAtravesDe: String = getString(R.string.texto_chegou_atraves)
        chegada_rollo.text = "${textoChegouAtravesDe} ${cheg_rollo}"

        bjorn_bt.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nome_chegada", "ROLLO")
            val intent = Intent(this, BjornIronside::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        outState.putString("info", this.info_rollo)
    }
}
