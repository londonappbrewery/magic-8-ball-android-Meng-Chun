package com.londonappbrewery.magiceightball;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask;
        ask = (Button) findViewById(R.id.askButton);

        final ImageView ball = (ImageView) findViewById(R.id.image_ball);

        final int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,
        };

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(5);
                Log.d("ask", "the random number is " + number + ".");
                ball.setImageResource(ballArray[number]);
            }
        });
    }
}
