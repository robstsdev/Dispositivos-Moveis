package com.example.aula1608;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtValor1, edtValor2;
    private Button btnCalcular;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);

    }

    public void calculadora(View v){

        int valor1, valor2, resultado;
        valor1 = Integer.parseInt(edtValor1.getText().toString());
        valor2 = Integer.parseInt(edtValor2.getText().toString());
        resultado = (valor1+valor2);
        txtResultado.setText(String.valueOf(resultado));

    }


}