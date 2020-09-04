package com.rajaryan.shakedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.squareup.seismic.ShakeDetector;


public class MainActivity extends AppCompatActivity implements ShakeDetector.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void hearShake() {
        Toast.makeText(MainActivity.this,"Shake Has Been Detected",Toast.LENGTH_SHORT).show();
    }
}
