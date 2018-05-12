package com.example.logonrm.cadastrojogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLimpar.setOnClickListener {
            Limpar()
        }

        btCadastrar.setOnClickListener {
            val telaSucesso = Intent(this, SucessoActivity::class.java)

            val jogo = Jogo(
                    etNome.text.toString(),
                    etGenero.text.toString(),
                    etLancamento.text.toString().toInt()
            )

            telaSucesso.putExtra("jogo", jogo)
            startActivity(telaSucesso)

            Limpar()
        }
    }

    private fun Limpar() {
        etLancamento.setText("");
        etGenero.setText("");
        etNome.setText("");
    }
}
