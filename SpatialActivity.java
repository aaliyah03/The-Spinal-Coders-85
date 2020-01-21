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

import java.util.LinkedList;
import java.util.Queue;

public class SpatialActivity extends AppCompatActivity {

    TextView letsgo;
    Button right, left, submit;
    ImageView man;
    RelativeLayout rel;
    Queue <String>clk;
    final String ans []={"L","R","L"};
    int score = 0,clicks = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spatial);
        letsgo = (TextView)findViewById(R.id.letsgo);
        right = (Button)findViewById(R.id.right);
        left = (Button) findViewById(R.id.left);
        submit = (Button) findViewById(R.id.submit);
        man = (ImageView)findViewById(R.id.man);
        rel = (RelativeLayout)findViewById(R.id.parent);
        clk = new LinkedList<String>();

        //Instructions
        right.setVisibility(View.INVISIBLE);
        left.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        letsgo.setText("Let's go to the market!\n To go to the market \n Take the first left, second right and then a left.");


        letsgo.postDelayed(new Runnable() {
            @Override
            public void run() {
                right.setVisibility(View.VISIBLE);
                left.setVisibility(View.VISIBLE);
                //submit.setVisibility(View.VISIBLE);
                letsgo.setText("Let's go to the market!\n Choose directions");
                rel.setBackgroundResource(R.mipmap.crosswalks_street);
            }
        }, 10000);

    }
    public void left(View v)
    {
        System.out.println("LEFT");
        Log.i("DIRECTION", "LEFT");
        clk.add("L");
        clicks++;
        validate();

    }

    public void right(View v)
    {
        System.out.println("RIGHT");
        Log.i("DIRECTION", "RIGHT");
        clk.add("R");
        clicks++;
        validate();

    }
    public void submit(View v)
    {
        System.out.println("SUBMIT");
        Log.i("CLICKS","SUBMIT" );

        for(int i =0 ;i<3&&clk.peek()!=null;i++)
        {
            String q = clk.remove();
            if (ans[i].equalsIgnoreCase(q))
                score = score + 10;
                /* - For every correct click in the correct order user scores 10 points,
                   - Max score in this case with hardcoded values is 30 points
                 */
        }
        System.out.println("SCORE");
        Log.i("SCORE"," "+score );
        //LAUNCH INTENT HERE
    }

    public void validate()
    {
        if(clicks==3)
        {
            right.setVisibility(View.INVISIBLE);
            left.setVisibility(View.INVISIBLE);
            submit.setVisibility(View.VISIBLE);
        }
    }

}

/*
VALIDATIONS:
- matching queue length with no. of clicks
- removing buttons after valid number of clicks
Using function called within left and right functions which validates and sets visibility accordingly
- Hardcoded string

*/