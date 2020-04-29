package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text = (String) getIntent().getExtras().get(ExtraConstants.TEXT);
        TextView secondTextView = (TextView) findViewById(R.id.secondTextView);
        secondTextView.setText(text);
    }
}
