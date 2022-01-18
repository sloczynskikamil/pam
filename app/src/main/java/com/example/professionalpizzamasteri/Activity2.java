package com.example.professionalpizzamasteri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    TextView water;
    TextView f1;
    TextView f2;
    TextView sugar;
    TextView salt;
    TextView yeast;
    TextView olive;

    TextView pieceWeight;
    TextView weight;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        initComponents();
        Intent nextIntent = getIntent();
        int result = nextIntent.getIntExtra("ile", 0);
        calculateIngredients(result);
        initListeners();
    }

    private void initListeners() {
        Button nextButton2 = findViewById(R.id.nextButton4);

        nextButton2.setOnClickListener(nextButton2Listener);
    }

    private final View.OnClickListener nextButton2Listener = v -> callActivity3();

    private void callActivity3() {
        Intent nextIntent = new Intent(this, Activity3.class);
        startActivity(nextIntent);
    }

    private void initComponents() {
        water = findViewById(R.id.textViewWaterResult);
        f1 = findViewById(R.id.textViewFlourP1Result);
        f2 = findViewById(R.id.textViewFlourP2Result);
        sugar = findViewById(R.id.textViewSugarResult);
        salt = findViewById(R.id.textViewSaltResult);
        yeast = findViewById(R.id.textViewYeastResult);
        olive = findViewById(R.id.textViewOliveResult);
        pieceWeight = findViewById(R.id.textViewPieceResult);
        weight = findViewById(R.id.textViewWeightResult);
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

        water.setText("ABC");
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
