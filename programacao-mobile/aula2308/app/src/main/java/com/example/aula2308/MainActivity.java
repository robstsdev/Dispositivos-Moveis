package com.example.aula2308;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Criando os Objetos da Tela
    private CheckBox chkNatacao, chkFutebol, chkBasquete;
    private Button btnMostrarDados, btnChamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Associando o Java com o Layout (Classe R)
        chkNatacao = findViewById(R.id.chkNatacao);
        chkFutebol = findViewById(R.id.chkFutebol);
        chkBasquete = findViewById(R.id.chkBasquete);
        btnMostrarDados = findViewById(R.id.btnMostrarDados);
        btnChamar = findViewById(R.id.btnChamar);
    }
    public void mostrar(View view){
        String nat=null, fut=null, bas=null;
        if(chkNatacao.isChecked())
            nat = "Natação";
        if(chkFutebol.isChecked())
            fut = "Futebol";
        if(chkBasquete.isChecked())
            bas = "Basquete";

        // caixa de mensagem - igual ao JOptionPane
        Toast.makeText(MainActivity.this, nat+" - "+fut+" - "+bas, Toast.LENGTH_SHORT).show();
    }
    public void chamarTela2(View view){
        Intent it = new Intent(getApplicationContext(),Tela2.class);
        startActivity(it);
    }
}