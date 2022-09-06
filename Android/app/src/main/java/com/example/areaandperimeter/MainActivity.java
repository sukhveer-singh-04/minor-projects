package com.example.areaandperimeter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClick(View view) {

       Button b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //     Log.d(TAG, "Button Clicked");

                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                startActivity(intent);

            }
        });
    }
    public void RecData(View view) {
        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Area_and_Perimeter_of_Rectangle.class);
                startActivity(intent);
            }
        });

    }
    public void CirData(View view) {

        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Area_and_Perimeter_of_Circle.class);
                startActivity(intent);
            }
        });
    }



}