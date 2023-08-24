package com.example.aula2308;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Tela2 extends AppCompatActivity {

    private RadioGroup rdgPeriodo;
    private RadioButton rdbManha, rdbTarde, rdbNoite;
    private Button btnMostrarPeriodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        // associar componentes

        rdgPeriodo = findViewById(R.id.rdgPeriodo);
        rdbManha = findViewById(R.id.rdbManha);
        rdbTarde = findViewById(R.id.rdbTarde);
        rdbNoite = findViewById(R.id.rdbNoite);
        btnMostrarPeriodo = findViewById(R.id.btnMostrarPeriodo);
    }
    public void mostrarPeriodo(View view){
        String periodo = null;
        if (rdbManha.isChecked())
            periodo = "Manhã";
        else if (rdbTarde.isChecked())
            periodo = "Tarde";
        else if (rdbNoite.isChecked())
            periodo = "Noite";
        else
            periodo = "Selecione um Período";

        Toast.makeText(Tela2.this, periodo, Toast.LENGTH_LONG).show();
    }
}