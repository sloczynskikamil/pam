package com.example.professionalpizzamasteri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    private final View.OnClickListener nextButtonListener = v -> callActivity2();

    private void callActivity2() {
        EditText pizzasAmount = (EditText) findViewById(R.id.pizzasAmount);
        String pizzas = pizzasAmount.getText().toString();
        if (pizzas.matches("")) {
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();
            return;
        } else {

            Intent nextIntent = new Intent(this, Activity2.class);
            nextIntent.putExtra("ile", Integer.parseInt(pizzasAmount.getText().toString()));
            startActivity(nextIntent);
        }
    }
}
