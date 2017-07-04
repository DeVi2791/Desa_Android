package nextu.dvillamar.appmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.media.*;
import android.util.*;
import android.provider.MediaStore.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Audio objaudio = new Audio();
        Files objfile = new Files();
        Video objvideo = new Video();
        FaceDetector objfacdetector = new FaceDetector(10,10,20);
        Base64 objb64;
    }
}
