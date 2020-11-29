package com.example.catemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mapa extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        ImageView btn_volver = findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener(this);

    }//fin del onCreate

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_volver:
                onBackPressed();
                break;
        }

    }
}