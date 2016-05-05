package com.example.matic.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private TextView testView;
    private Button button_DingPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void button_test_click(View view) {
        testView = (TextView)findViewById(R.id.textView);
        testView.setText("Hello, Horis~  ^^");
    }

    public void button_DingPu_OnClick(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Page01Activity.class);
        startActivity(intent);
        MainActivity.this.finish();
    }
}
