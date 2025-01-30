package com.example.tasks;

import static java.lang.Math.pow;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    EditText x;
    TextView resw;
    Button resbtn,nextbtn;


    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        x = findViewById(R.id.x);
        resw = findViewById(R.id.resw);
        resbtn = findViewById(R.id.resbtn);
        nextbtn = findViewById(R.id.nextbtn);

        resbtn.setOnClickListener(v -> check());
        nextbtn.setOnClickListener(v -> nextPageListener());
    }

    private void nextPageListener() {
        Intent intent = new Intent(this , LastActivity.class);
        startActivity(intent);
    }

    private void check() {
        String xStr = x.getText().toString();
        double x = Double.parseDouble(xStr);
        double y = 3*pow(x,6)-6*pow(x,2)-7;
        resw.setText("Ответ: "+ y);


    }
}