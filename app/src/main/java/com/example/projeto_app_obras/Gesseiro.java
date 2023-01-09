package com.example.projeto_app_obras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Gesseiro extends AppCompatActivity {

    private TextView voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        getSupportActionBar().hide();
        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogout = new Intent(Gesseiro.this, FormLogin.class);
                startActivity(intentLogout);
            }
        });
    }
    private void IniciarComponentes(){
        voltar = findViewById(R.id.botao_logout);
    }
}