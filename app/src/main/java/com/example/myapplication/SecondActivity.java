package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.utils.ExtraConstants;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text = Objects.requireNonNull(getIntent().getExtras()).getString(ExtraConstants.TEXT);
        TextView secondTextView = findViewById(R.id.secondTextView);
        secondTextView.setText(text);
    }
}
