package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            //Passos para captar os valores inputados nos Inputs e Botões
        //Recuperar os componentes digitados no EditText
        //Criar uma variavel e captar os valores o componente de UI(TextInputEditText)
        //Recuperar o Botão da tela setOnClickListener
        //Recuperar texto digitado no edtPeso

        val edtPeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edttext_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        btnCalcular.setOnClickListener{
            val peso: Float = edtPeso.text.toString().toFloat()
            val altura:Float = edtAltura.text.toString().toFloat()

            val calcAltura = altura * altura
            val resultado = peso / calcAltura
            println("Valor calculado" + resultado)
        }

    }
}