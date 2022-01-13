package com.example.professionalpizzamasteri;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    TextView water = findViewById(R.id.textViewWaterResult);
    TextView f1 = findViewById(R.id.textViewFlourP1Result);
    TextView f2 = findViewById(R.id.textViewFlourP2Result);
    TextView sugar = findViewById(R.id.textViewSugarResult);
    TextView salt = findViewById(R.id.textViewSaltResult);
    TextView yeast = findViewById(R.id.textViewYeastResult);
    TextView olive = findViewById(R.id.textViewOliveResult);

    TextView pieceWeight = findViewById(R.id.textViewPieceResult);
    TextView weight = findViewById(R.id.textViewWeightResult);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent nextIntent = getIntent();
        String message = nextIntent.getStringExtra("ile");
        calculateIngredients(Integer.parseInt(message));
    }

    public void calculateIngredients(int ile) {
        float makaPorcja1 = (float) 1000.0 / 10;
        float makaPorcja2 = (float) 500.0 / 10;
        float woda = (float) 1000.0 / 10;
        float sol = (float) 50.0 / 10;
        float drozdze = (float) 2.0 / 10;
        float cukier = (float) 20.0 / 10;
        float oliwa = (float) 50.0 / 10;

        float finalMakaPorcja1 = makaPorcja1 * ile;
        float finalMakaPorcja2 = makaPorcja2 * ile;
        float finalWoda = woda * ile;
        float finalSol = sol * ile;
        float finalDrozdze = drozdze * ile;
        float finalCukier = cukier * ile;
        float finalOliwa = oliwa * ile;

        float finalMakaSuma = finalMakaPorcja1 + finalMakaPorcja2;
        float wagaCiasta = finalMakaSuma + finalWoda + finalSol + finalDrozdze + finalCukier + finalOliwa;

        water.setText(String.valueOf(finalWoda));
        f1.setText(String.valueOf(finalMakaPorcja1));
        f2.setText(String.valueOf(finalMakaPorcja2));
        yeast.setText(String.valueOf(finalDrozdze));
        sugar.setText(String.valueOf(finalCukier));
        salt.setText(String.valueOf(finalSol));
        olive.setText(String.valueOf(finalOliwa));
        pieceWeight.setText(String.valueOf(wagaCiasta/ile));
        weight.setText(String.valueOf(wagaCiasta));
    }
}
