package com.example.professionalpizzamasteri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Activity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        TextView timer = findViewById(R.id.counter3);
        Button nextButton7 = findViewById(R.id.nextButton8);
        nextButton7.setEnabled(false);

        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("00");
                long hour = (millisUntilFinished / 3600000) % 24;
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                timer.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));
            }

            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                timer.setText("00:00:00");
                nextButton7.setEnabled(true);
            }
        }.start();

        final View.OnClickListener nextButton3Listener = v -> callActivity11();
        nextButton7.setOnClickListener(nextButton3Listener);
    }

    private void callActivity11() {
        Intent nextIntent = new Intent(this, Activity11.class);
        startActivity(nextIntent);
    }
}