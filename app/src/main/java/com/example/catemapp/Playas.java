package com.example.catemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.catemapp.playas.Balzapote;
import com.example.catemapp.playas.La_Barra;
import com.example.catemapp.playas.Montepio;
import com.example.catemapp.playas.Playa_Escondida;
import com.example.catemapp.playas.Roca_Partida;

public class Playas extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playas);
        ImageView btn_volver = findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener(this);

        //botones
        Button btn_Barra = findViewById(R.id.btn_labarra);
        btn_Barra.setOnClickListener(this);

        Button btn_Escondida = findViewById(R.id.playa_escondida);
        btn_Escondida.setOnClickListener(this);

        Button btn_Balza = findViewById(R.id.playa_balsa);
        btn_Balza.setOnClickListener(this);

        Button btn_Monte = findViewById(R.id.playa_monte);
        btn_Monte.setOnClickListener(this);

        Button btn_Partida = findViewById(R.id.playa_roca);
        btn_Partida.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_volver:
                onBackPressed();
                break;
            case R.id.btn_labarra:
                Intent intent = new Intent(getApplicationContext(), La_Barra.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.playa_escondida:
                Intent intent1 = new Intent(getApplicationContext(), Playa_Escondida.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);
                break;
            case R.id.playa_balsa:
                Intent intent2 = new Intent(getApplicationContext(), Balzapote.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent2);
                break;
            case R.id.playa_monte:
                Intent intent3 = new Intent(getApplicationContext(), Montepio.class);
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent3);
                break;

            case R.id.playa_roca:
                Intent intent4 = new Intent(getApplicationContext(), Roca_Partida.class);
                intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent4);

        }
    }
}