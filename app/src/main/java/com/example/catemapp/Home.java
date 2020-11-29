package com.example.catemapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity implements View.OnClickListener {
    private Intent intent;
    private final static String video = "https://www.youtube.com/watch?v=e8baivAoyq4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView pescador = findViewById(R.id.idPescador);
        pescador.setOnClickListener(this);
    }
    public void ClickSitios (View view) {
    intent = new Intent(getApplicationContext(),Sitios.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(intent);

    }
    public void ClickPlayas (View view){
        intent = new Intent(getApplicationContext(),Playas.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
    public void ClickRestaurante(View view){
        intent = new Intent(getApplicationContext(), Restaurantes.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
    public void ClicHotel(View view){
        intent = new Intent(getApplicationContext(),Hotel.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
    public void ClicSalir (View view){
        //inicializar alertdialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Salir de la app");
        builder.setMessage("¿Está seguro de querer salir?");
        builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                    }
                });
        builder.show();

    }
    public void ClicMapa(View view){
        intent = new Intent(getApplicationContext(), Mapa.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
    public void ClicPaseo(View view){
        intent = new Intent(getApplicationContext(), Paseo.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }

    @Override
    public void onClick(View view) {
        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        switch (view.getId()){
            case R.id.idPescador:
                intent1.setData(Uri.parse(video));
                startActivity(intent1);
                break;

        }

    }
}//fin de la clase