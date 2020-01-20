package com.example.thespinalcoders85;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SpatialActivity extends AppCompatActivity {

    TextView letsgo;
    Button right, left;
    ImageView man;
    RelativeLayout rel;
    int click =0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spatial);
        letsgo = (TextView)findViewById(R.id.letsgo);
        right = (Button)findViewById(R.id.right);
        left = (Button) findViewById(R.id.left);
        man = (ImageView)findViewById(R.id.man);
        rel = (RelativeLayout)findViewById(R.id.parent);


        //Instructions
        right.setVisibility(View.INVISIBLE);
        left.setVisibility(View.INVISIBLE);
        letsgo.setText("Let's go to the market!\n To go to the market \n Take the first left, second right and then a left.");


        letsgo.postDelayed(new Runnable() {
            @Override
            public void run() {
                right.setVisibility(View.VISIBLE);
                left.setVisibility(View.VISIBLE);
                letsgo.setText("Let's go to the market!\n Choose directions");
                rel.setBackgroundResource(R.mipmap.crosswalks_street);
            }
        }, 10000);

    }
    public void left(View v)
    {
        System.out.println("LEFT");
        Log.i("DIRECTION", "LEFT");
        click++;
    }

    public void right(View v)
    {
        System.out.println("RIGHT");
        Log.i("DIRECTION", "RIGHT");
        click++;
    }

}
