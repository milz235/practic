package com.example.tasks;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText a,b;
    TextView resw;
    Button buttonCalculate, resbutton;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        resw = findViewById(R.id.resw);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        resbutton = findViewById(R.id.resbutton);

        buttonCalculate.setOnClickListener(v -> cneck());
        resbutton.setOnClickListener(v -> nextPageListenner());

    }
    @SuppressLint("SetTextI18n")
    private void cneck() {
        String aStr = a.getText().toString();
        String bStr = b.getText().toString();
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Math.sqrt(a*a+b*b);
        double p = a+b+c;
        resw.setText("" +"C=" + String.format("%.2f",c) + "\nP="+String.format("%.2f",p));
    }

    private void nextPageListenner() {
        Intent intent = new Intent(this , SecondActivity.class);
        startActivity(intent);

    }

}