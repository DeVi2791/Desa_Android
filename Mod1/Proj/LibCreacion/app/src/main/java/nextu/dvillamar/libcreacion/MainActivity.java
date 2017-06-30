package nextu.dvillamar.libcreacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import nextu.dvillamar.milibreria.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Texto;",PruebaLibreria.texto);
    }
}
