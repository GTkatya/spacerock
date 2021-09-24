package com.example.spacerock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Moon extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon);
        MainActivity start = new MainActivity();
        Button b = findViewById(R.id.button2);
        b.setOnClickListener(this);
        Button bad = findViewById(R.id.bAdd);
        bad.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.button2:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.bAdd:
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Пора покормить кота!", Toast.LENGTH_SHORT);
                toast.show();
//                String buttonText = "Click Me";
//                Log.i("tag","text");
                break;
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}