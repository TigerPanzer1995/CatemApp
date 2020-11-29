package com.example.catemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.catemapp.sitios.Isla;
import com.example.catemapp.sitios.Jungla;
import com.example.catemapp.sitios.Laguna;
import com.example.catemapp.sitios.Nanciyaga;
import com.example.catemapp.sitios.Sontecomoapan;

public class Sitios extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);
        ImageView btn_volver = findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener(this);
        //botones de los lugares
        Button btn_nanciyaga = findViewById(R.id.btn_nanciyaga);
        btn_nanciyaga.setOnClickListener(this);

        Button btn_laguna = findViewById(R.id.btn_laguna);
        btn_laguna.setOnClickListener(this);

        Button btn_isla = findViewById(R.id.btn_monos);
        btn_isla.setOnClickListener(this);

        Button btn_jungla = findViewById(R.id.btn_jungla);
        btn_jungla.setOnClickListener(this);

        Button btn_sonte = findViewById(R.id.btn_sonte);
        btn_sonte.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
           case R.id.btn_volver:
               onBackPressed();
               break;
           case R.id.btn_nanciyaga:
               Intent intent = new Intent(getApplicationContext(), Nanciyaga.class);
               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               startActivity(intent);
               break;

           case R.id.btn_laguna:
               Intent intent1 = new Intent(getApplicationContext(), Laguna.class);
               intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               startActivity(intent1);
               break;

           case R.id.btn_monos:
               Intent intent2 = new Intent(getApplicationContext(), Isla.class);
               intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               startActivity(intent2);
               break;

           case R.id.btn_sonte:
               Intent intent3 = new Intent(getApplicationContext(), Sontecomoapan.class);
               intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               startActivity(intent3);
               break;

           case R.id.btn_jungla:
               Intent intent4 = new Intent(getApplicationContext(), Jungla.class);
               intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               startActivity(intent4);
               break;

       }

    }
}