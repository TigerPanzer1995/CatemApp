package com.example.catemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //agregar animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        //declaramos las variables
        TextView nombre_app = findViewById(R.id.titulo_splash);
        ImageView imageView_app = findViewById(R.id.iv_catemapp);

        //cargamos las variables a las animaciones
        nombre_app.setAnimation(animation3);
        imageView_app.setAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                finish();
                Toast.makeText(MainActivity.this, "Da click a la imagen del pesacador para un vídeo", Toast.LENGTH_LONG).show();


            }
        },4000);
    }
}