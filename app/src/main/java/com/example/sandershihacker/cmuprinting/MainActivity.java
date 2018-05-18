package com.example.sandershihacker.cmuprinting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String ANDREW_ID = "com.example.sandershihacker.cmuprinting.ANDREW_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoPrint(View view) {
        Intent intent = new Intent(this, PrintActivity.class);
        EditText andrewIDEditText = (EditText) findViewById(R.id.andrewIDEditText);
        String andrewID = andrewIDEditText.getText().toString();
        intent.putExtra(ANDREW_ID, andrewID);
        startActivity(intent);
    }
}
