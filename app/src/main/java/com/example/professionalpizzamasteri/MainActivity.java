package com.example.professionalpizzamasteri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        Button nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(nextButtonListener);
    }

    private View.OnClickListener nextButtonListener = new View.OnClickListener() {
        public void onClick(View v) {

            callActivity2();
        }
    };

    private void callActivity2() {
        Intent nextIntent = new Intent(this, Activity2.class);
        EditText pizzasAmount = (EditText)findViewById(R.id.pizzasAmount);
        nextIntent.putExtra("ile", Integer.parseInt(pizzasAmount.getText().toString()));
        startActivity(nextIntent);
    }
}
