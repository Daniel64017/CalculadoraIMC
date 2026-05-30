package com.example.calculadoraimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialização dos componentes usando findViewById
        val inputLayoutPeso = findViewById<TextInputLayout>(R.id.inputLayoutPeso)
        val inputLayoutAltura = findViewById<TextInputLayout>(R.id.inputLayoutAltura)
        val editPeso = findViewById<TextInputEditText>(R.id.editPeso)
        val editAltura = findViewById<TextInputEditText>(R.id.editAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            // Limpa erros anteriores
            inputLayoutPeso.error = null
            inputLayoutAltura.error = null

            val pesoText = editPeso.text.toString().trim()
            val alturaText = editAltura.text.toString().trim()

            // Validação simples
            var dadosValidos = true

            val pesoValido = pesoText.replace(',', '.').toDoubleOrNull()
            if (pesoValido == null || pesoValido <= 0.0) {
                inputLayoutPeso.error = getString(R.string.erro_peso)
                dadosValidos = false
            }

            val alturaValida = alturaText.replace(',', '.').toDoubleOrNull()
            if (alturaValida == null || alturaValida <= 0.0) {
                inputLayoutAltura.error = getString(R.string.erro_altura)
                dadosValidos = false
            }

            // Se os dados forem válidos, vai para a tela de resultados
            if (dadosValidos && pesoValido != null && alturaValida != null) {
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("PESO", pesoValido)
                intent.putExtra("ALTURA", alturaValida)
                startActivity(intent)
            }
        }
    }
}
