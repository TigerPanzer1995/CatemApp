package com.example.catemapp.playas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.catemapp.R;

public class La_Barra extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la__barra);
        ImageView btn_volver = findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_volver:
                onBackPressed();
                break;
        }

    }
}