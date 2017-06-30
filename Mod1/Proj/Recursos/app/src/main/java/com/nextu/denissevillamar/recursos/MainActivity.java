package com.nextu.denissevillamar.recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Añadir color por Código
        TextView texto = (TextView) findViewById(R.id.main);
        texto.setText(R.string.futbol);
    }
}
