package com.example.spacerock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Moon moon = new Moon();
        Button b = findViewById(R.id.buttonE);
        b.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        Intent intent = new Intent(this, Moon.class);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}