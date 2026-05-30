package com.example.calculadoraimc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Inicialização dos componentes
        val txtResultadoImc = findViewById<TextView>(R.id.txtResultadoImc)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // Recebimento dos valores de peso e altura enviados da MainActivity
        val peso = intent.getDoubleExtra("PESO", 0.0)
        val altura = intent.getDoubleExtra("ALTURA", 0.0)

        // Realiza o cálculo do IMC se os valores forem válidos
        if (peso > 0.0 && altura > 0.0) {
            val imc = peso / (altura * altura)
            
            // Formata o IMC com 1 casa decimal usando a localidade US para usar ponto decimal
            // ou Locale.getDefault() dependendo do idioma do celular, mas formatar explícito
            // com Locale.US ou Locale.getDefault() garante que a formatação seja correta.
            val imcFormatado = String.format(Locale.getDefault(), "%.1f", imc)
            txtResultadoImc.text = imcFormatado
        } else {
            txtResultadoImc.text = "Erro"
        }

        // Botão de voltar que simplesmente encerra a Activity atual nativamente
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
