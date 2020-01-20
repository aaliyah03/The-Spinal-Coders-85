package com.example.patronus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class market extends AppCompatActivity {

    Button b1, b2, b3;
    int score1, errors = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        Intent i = getIntent();
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button4);

        score1 = 0;
        errors = 0;
    }

    public void f1(View view) {
        Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT).show();
        errors++; //to keep a count of how many times person is repeatedly guessing wrong answer
    }

    public void f2(View view) {
        Toast.makeText(this, "Are you sure?", Toast.LENGTH_SHORT).show();
        errors++; //to keep a count of how many times person is repeatedly guessing wrong answer
    }

    public void f3(View view) {
        Toast.makeText(this, "Great! Let's get started!", Toast.LENGTH_SHORT).show();
        score1++;
        calculate();
    }

    public void calculate() {
        int totalscore = score1 - errors; //(thus, minimum can be negative - indication of memory loss/repetition n behavior, or positive - normal behavior)
    }
}
