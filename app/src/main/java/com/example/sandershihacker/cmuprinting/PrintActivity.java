package com.example.sandershihacker.cmuprinting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PrintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);

        Intent intent = getIntent();
        String andrewID = intent.getStringExtra(MainActivity.ANDREW_ID);

        TextView andrewIDTextView = findViewById(R.id.andrewIDTextView);
        andrewIDTextView.setText("Printing for Andrew ID:" + andrewID);
    }
}
