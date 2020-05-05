package com.example.onebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numberOfPresses = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NewTextView(View view) {
        numberOfPresses++;
        switch (numberOfPresses) {
            case 1: {
                TextView newText = findViewById(R.id.textView);
                newText.setText("My New Cool Text");
                newText.setTextSize(28);
                newText.setTextColor(Color.BLACK);
                newText.setBackgroundColor(Color.YELLOW);
            }
            break;
            case 2: {
                TextView newText = findViewById(R.id.textView);
                newText.setText("My New Cool Text 2");
                newText.setTextSize(35);
                newText.setBackgroundColor(Color.GREEN);
                numberOfPresses = 0;
            }
            break;
            default: {
            } break;
        }
    }
}
