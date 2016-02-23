package com.example.valaitis.homework1_final;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Game2 extends AppCompatActivity {
    Button buttonPress;
    Button buttonPress2;
    Button buttonPress3;
    Button buttonPress4;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        context=(Context)this;

        buttonPress=(Button) findViewById(R.id.radioButton1);
        buttonPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Results.class);
                startActivity(intent);
            }
        });

        buttonPress=(Button) findViewById(R.id.radioButton2);
        buttonPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Results.class);
                startActivity(intent);
            }
        });

        buttonPress=(Button) findViewById(R.id.radioButton3);
        buttonPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Results.class);
                startActivity(intent);
            }
        });

        buttonPress=(Button) findViewById(R.id.radioButton4);
        buttonPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Results.class);
                startActivity(intent);
            }
        });
    }
}

