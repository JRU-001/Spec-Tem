package com.example.forma;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE4);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.nombreR);
        textView.setText(message);

        TextView textView2 = findViewById(R.id.correoR);
        textView2.setText(message2);

        TextView textView3 = findViewById(R.id.edadR);
        textView.setText(message3);

        TextView textView4 = findViewById(R.id.fechaR);
        textView.setText(message4);

    }
}
