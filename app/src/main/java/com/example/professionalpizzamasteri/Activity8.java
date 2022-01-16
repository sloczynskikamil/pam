package com.example.professionalpizzamasteri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        Button nextButton8 = findViewById(R.id.nextButton5);
        final View.OnClickListener nextButton5Listener = v -> callActivity9();
        nextButton8.setOnClickListener(nextButton5Listener);
    }

    private void callActivity9() {
        Intent nextIntent = new Intent(this, Activity9.class);
        startActivity(nextIntent);
    }
}