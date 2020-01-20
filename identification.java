package com.example.sih2020;

import androidx.appcompat.app.AppCompatActivity;
import android.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class identification extends AppCompatActivity
{
//    TextView tv1,tv2,tv3,tv4;
    Button b2,b3,b4;
    int wrongcnt=0,rightcnt=0;;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
    }

    public void b_2(View view)
    {
        wrongcnt++;
    }
    public void b_3(View view)
    {
        wrongcnt++;
    }

    public void b_4(View view)
    {
        rightcnt++;
    }
}
