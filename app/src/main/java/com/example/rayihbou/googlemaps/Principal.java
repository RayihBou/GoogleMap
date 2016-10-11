package com.example.rayihbou.googlemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    /* La siguiente App Simula el uso de GoogleMapsApi
    Para poder accesar a esta api tenemos que visitar el siguiente Link
    https://developers.google.com/maps/documentation/android-api/?hl=es-419
    En la cual encontraremos el material necesario para ello
    Podemos crear el activity de Google (Google Maps Activity
    El cual automaticamente nos genera la clase necesaria para interactuar con los mapas
    y el layout del mismo que se encuentra presente como un fragment.
    Adicional se genera un archivo .xml ubicado en values el cual nos permite generar la conexción
    para el access token necesario para activar nuestra app.
    En el documento se encuentra todos los pasos necesarios de una forma muy sencilla.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void irMonserate (View v){
        Intent i = new Intent(this, Monserate.class);
        startActivity(i);
    }

    public void irPlazaBolivar (View v){
        Intent i1 = new Intent(this, PlazaBolivars.class);
        startActivity(i1);
    }

    public void irColPatria (View v) {
        Intent i2 = new Intent(this, TorreColPatria.class);
        startActivity(i2);
    }

    public void irCasaNarino (View v) {
        Intent i3 = new Intent(this, CasadeNarino.class);
        startActivity(i3);
    }
}
