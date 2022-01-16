package com.example.professionalpizzamasteri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);

        Button nextButton4 = findViewById(R.id.nextButton9);
        final View.OnClickListener nextButton4Listener = v -> end();
        nextButton4.setOnClickListener(nextButton4Listener);
    }

    private void end() {
        finishAffinity();
        System.exit(0);
    }
}