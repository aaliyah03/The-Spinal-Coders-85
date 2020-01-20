package com.example.swami;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
Button b1;
TextView t1;
TextView t2,t3,t4;
Animation animlr,animtb,animrl,animbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView3);
        animlr = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.l2r);
        animtb = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.t2b);
        animrl = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.r2l);
        animbt = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.b2t);
        // Move
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t3.startAnimation(animrl);
                t1.startAnimation(animlr);
                t2.startAnimation(animtb);
                t4.startAnimation(animbt);
            }
        });
}}