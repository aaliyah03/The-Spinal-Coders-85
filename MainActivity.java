package com.example.sih2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        tv1=(TextView)findViewById(R.id.textView);
//        tv2=(TextView)findViewById(R.id.textView2);
//        tv3=(TextView)findViewById(R.id.textView3);
//        tv4=(TextView)findViewById(R.id.textView4);

//        tv1.setTextSize(16);
//        tv2.setTextSize(16);
//        tv3.setTextSize(16);
//        tv4.setTextSize(16);
    }

    public void proceed(View view)
    {
        Intent i1=new Intent(this,identification.class);
        startActivity(i1);
    }

}
