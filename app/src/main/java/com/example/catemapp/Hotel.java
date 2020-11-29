package com.example.catemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.catemapp.hoteles.Arcos;
import com.example.catemapp.hoteles.HotelDelAngel;
import com.example.catemapp.hoteles.HotelDelLago;
import com.example.catemapp.hoteles.HotelLaFinca;
import com.example.catemapp.hoteles.HotelPlayaAzul;
import com.example.catemapp.hoteles.HotelPlayaCristal;

public class Hotel extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        ImageView imageView = findViewById(R.id.btn_volver);
        imageView.setOnClickListener(this);

        //BOTONES DE HOTELES
        Button btn_finca = findViewById(R.id.btn_Finca);
        btn_finca.setOnClickListener(this);

        Button btn_angel = findViewById(R.id.btn_hotelAngel);
        btn_angel.setOnClickListener(this);

        Button btn_lago = findViewById(R.id.btn_hotelLago);
        btn_lago.setOnClickListener(this);

        Button btn_playa= findViewById(R.id.btn_playaAzul);
        btn_playa.setOnClickListener(this);

        Button btn_cristal = findViewById(R.id.btn_playaCristal);
        btn_cristal.setOnClickListener(this);

        Button btn_arcos= findViewById(R.id.btn_hotelArcos);
        btn_arcos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_volver:
                onBackPressed();
                break;
            case R.id.btn_Finca:
                Intent intent = new Intent(getApplicationContext(), HotelLaFinca.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;

            case R.id.btn_hotelAngel:
                Intent intent1 = new Intent(getApplicationContext(), HotelDelAngel.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);
                break;

            case R.id.btn_hotelLago:
                Intent intent2 = new Intent(getApplicationContext(), HotelDelLago.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent2);
                break;

            case R.id.btn_playaAzul:
                Intent intent3 = new Intent(getApplicationContext(), HotelPlayaAzul.class);
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent3);
                break;
            case R.id.btn_playaCristal:
                Intent intent4 = new Intent(getApplicationContext(), HotelPlayaCristal.class);
                intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent4);
                break;
            case R.id.btn_hotelArcos:
                Intent intent5 = new Intent(getApplicationContext(), Arcos.class);
                intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent5);
                break;
        }
    }
}