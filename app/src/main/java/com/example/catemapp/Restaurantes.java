package com.example.catemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.catemapp.restaurantes.Gorell;
import com.example.catemapp.restaurantes.La_Casita;
import com.example.catemapp.restaurantes.Ola;
import com.example.catemapp.restaurantes.Sazon;
import com.example.catemapp.restaurantes.Tierra;

public class Restaurantes extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
        ImageView imageView = findViewById(R.id.btn_volver);
        imageView.setOnClickListener(this);

        //botones
        Button btn_Gorell = findViewById(R.id.btnGorell);
        btn_Gorell.setOnClickListener(this);

        Button btn_Casita= findViewById(R.id.btn_resCasita);
        btn_Casita.setOnClickListener(this);

        Button btn_Ola = findViewById(R.id.btnOla);
        btn_Ola.setOnClickListener(this);

        Button btn_Sazon = findViewById(R.id.btnSazon);
        btn_Sazon.setOnClickListener(this);

        Button btn_Tierra = findViewById(R.id.btnTierra);
        btn_Tierra.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_volver:
                onBackPressed();
                break;
            case R.id.btnGorell:
                Intent intent = new Intent(getApplicationContext(), Gorell.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.btn_resCasita:
                Intent intent1 = new Intent(getApplicationContext(), La_Casita.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);
                break;
            case R.id.btnOla:
                Intent intent2= new Intent(getApplicationContext(), Ola.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent2);
                break;
            case R.id.btnSazon:
                Intent intent3 = new Intent(getApplicationContext(), Sazon.class);
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent3);
                break;
            case R.id.btnTierra:
                Intent intent4 = new Intent(getApplicationContext(), Tierra.class);
                intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent4);
                break;



        }

    }
}