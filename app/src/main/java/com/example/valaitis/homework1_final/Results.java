package com.example.valaitis.homework1_final;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Results extends AppCompatActivity {

    Button buttonPress;
    Button buttonPress2;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        context =(Context)this;

        buttonPress=(Button)findViewById(R.id.restart_button);
        buttonPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Game.class);
                startActivity(intent);

            }
        });

        buttonPress=(Button)findViewById(R.id.quit_button);
        buttonPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Homework1.class);
                startActivity(intent);

            }
        });
    }


    /*Button buttonPress;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework1);
        context=(Context)this;
        buttonPress=(Button)findViewById(R.id.start_button);
        buttonPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Game.class);
                startActivity(intent);

            }
        });
    }*/
}
