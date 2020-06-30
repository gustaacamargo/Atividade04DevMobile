package com.camargo.aula3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_floki.*

class Floki : AppCompatActivity() {

    private lateinit var info_floki: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        if(savedInstanceState != null) {
            this.info_floki = savedInstanceState.getString("info", "")
        }
        else {
            this.info_floki = ""
        }
        chegada_floki.text = this.info_floki

        val cheg_floki = intent.extras?.getString("nome_chegada")
        val textoChegouAtravesDe: String = getString(R.string.texto_chegou_atraves)
        chegada_floki.text = "${textoChegouAtravesDe} ${cheg_floki}"

        ragnar_bt.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nome_chegada", "FLOKI")
            val intent = Intent(this, RagnarLothbrok::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        outState.putString("info", this.info_floki)
    }
}
