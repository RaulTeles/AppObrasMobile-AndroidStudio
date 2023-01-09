package com.example.projeto_app_obras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    private TextView logout,pintor,encanador,eletricista,marceneiro,gesseiro;
    private TextView pedreiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        getSupportActionBar().hide();
        IniciarComponentes();
        pedreiro();

        logout.setOnClickListener(view -> {
            Intent intentLogout = new Intent(TelaPrincipal.this, FormLogin.class);
            startActivity(intentLogout);
        });
        pedreiro.setOnClickListener(view -> {
            Intent intentPedreiro = new Intent(TelaPrincipal.this, Pedreiro.class);
            startActivity(intentPedreiro);
        });
        pintor.setOnClickListener(view -> {
            Intent intentPintor = new Intent(TelaPrincipal.this, Pintor.class);
            startActivity(intentPintor);
        });
        encanador.setOnClickListener(view -> {
            Intent intentLogout = new Intent(TelaPrincipal.this, Encanador.class);
            startActivity(intentLogout);
        });
        eletricista.setOnClickListener(view -> {
            Intent intentLogout = new Intent(TelaPrincipal.this, Eletricista.class);
            startActivity(intentLogout);
        });
        marceneiro.setOnClickListener(view -> {
            Intent intentLogout = new Intent(TelaPrincipal.this, Marceneiro.class);
            startActivity(intentLogout);
        });
        gesseiro.setOnClickListener(view -> {
            Intent intentLogout = new Intent(TelaPrincipal.this, Gesseiro.class);
            startActivity(intentLogout);
        });
    }
        private void IniciarComponentes(){
            logout = findViewById(R.id.botao_logout);
            pintor = findViewById(R.id.botao_pintor);
            eletricista = findViewById(R.id.botao_eletricista);
            encanador = findViewById(R.id.botao_encanador);
            marceneiro = findViewById(R.id.botao_marceneiro);
            gesseiro = findViewById(R.id.botao_gesseiro);
        }
        private void pedreiro(){
            pedreiro = findViewById(R.id.botao_pedreiro);
        }
}