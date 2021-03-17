package com.example.contractorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initCalcButton();
    }

    public void initCalcButton() {
        Button calcButton = findViewById(R.id.buttonCalc);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText labor = findViewById(R.id.editLabor);
                EditText materials = findViewById(R.id.editMaterials);
                TextView subtotalDisplay = findViewById(R.id.resultSubtotal);
                TextView taxDisplay = findViewById(R.id.resultTax);
                TextView totalDisplay = findViewById(R.id.resultTotal);

                double laborInput = Double.parseDouble(labor.getText().toString());
                double materialsInput = Double.parseDouble(materials.getText().toString());
                double subtotal = laborInput + materialsInput;
                double tax = subtotal * 0.05;
                double total = subtotal + tax;

                subtotalDisplay.setText("$" + String.valueOf(subtotal));
                taxDisplay.setText("$" + String.valueOf(tax));
                totalDisplay.setText("$" + String.valueOf(total));
            }
        });
    }
}