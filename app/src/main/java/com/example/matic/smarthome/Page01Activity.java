package com.example.matic.smarthome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Page01Activity extends AppCompatActivity {

    private Button button_TV;
    private Button button_AirConditioner;
    private Button button_Light_Room;
    private Button button_BackMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page01);

        button_TV = (Button)findViewById(R.id.button_TV);
        button_AirConditioner = (Button)findViewById(R.id.button_AirConditioner);
        button_BackMainMenu = (Button)findViewById(R.id.button_Back);

        button_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_BackMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Page01Activity.this, MainActivity.class);
                startActivity(intent);
                Page01Activity.this.finish();
            }
        });

    }
}
