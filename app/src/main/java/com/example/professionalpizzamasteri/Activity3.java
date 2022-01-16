package com.example.professionalpizzamasteri;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView timer = findViewById(R.id.counter);
        Button nextButton4 = findViewById(R.id.nextButton4);
        nextButton4.setEnabled(false);

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
                nextButton4.setEnabled(true);
            }
        }.start();

        final View.OnClickListener nextButton3Listener = v -> callActivity4();
        nextButton4.setOnClickListener(nextButton3Listener);
    }

    private void callActivity4() {
        Intent nextIntent = new Intent(this, Activity4.class);
        startActivity(nextIntent);
    }
}
