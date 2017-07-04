package nextu.dvillamar.ejimportacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.googleapis.maps.*;

//Media
import android.os.Bundle;
import android.hardware.*;
import android.net.wifi.*;
import android.bluetooth.*;

//Location
import android.location.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WifiManager wifi;
        Sensor sensor;
        BluetoothManager BM;

        //Location
        LocationManager Lm=null;
        LocationProvider Lp = null;
        LocationListener Ll=null;

        Lm.getClass();
        Lp.getAccuracy();
        Ll.getClass();
    }
}
