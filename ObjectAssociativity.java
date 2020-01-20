package com.example.patronus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class gaincoins extends AppCompatActivity {

    ImageButton ib;
    int scores2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaincoins);

        ib = findViewById(R.id.imageButton3);
    }

    public void f4(View view) {
        scores2++;
    }

    public void f5(View view) {
        scores2 = scores2 - 2; //negative would indicate low object associativity
    }
}
