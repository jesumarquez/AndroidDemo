package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.utils.ExtraConstants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumberEditText = findViewById(R.id.firstNumberEditText);
                EditText secondNumberEditText = findViewById(R.id.secondNumberEditText);

                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                int res = num1 + num2;

                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(String.valueOf(res));
            }
        });

        Button goToGoogleButton = findViewById(R.id.goToGoogleButton);
        goToGoogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleStr = getResources().getString(R.string.google_url);
                Uri googleUrl = Uri.parse(googleStr);
                Intent goToGoogleIntent = new Intent(Intent.ACTION_VIEW, googleUrl);

                if(goToGoogleIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToGoogleIntent);
                }
            }
        });

        Button goShowActivityButton = findViewById(R.id.showActivityButton);
        goShowActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivityIntent = new Intent(getApplicationContext(), SecondActivity.class);
                String text = getResources().getString(R.string.second_activity);
                secondActivityIntent.putExtra(ExtraConstants.TEXT, text);
                startActivity(secondActivityIntent);
                ExtraConstants c = new ExtraConstants();
            }
        });
    }
}
