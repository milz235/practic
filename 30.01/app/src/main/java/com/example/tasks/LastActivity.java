package com.example.tasks;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LastActivity extends AppCompatActivity {
    TextView resw;
    Button resbtn;
    EditText a;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_last);
        a = findViewById(R.id.a);
        resw = findViewById(R.id.resw);
        resbtn = findViewById(R.id.resbtn);

        resbtn.setOnClickListener(v -> check());
    }

    private void check() {
        String aStr = a.getText().toString();
        double a = Double.parseDouble(aStr);
        double a2 = a*a;
        double a4 = a2*a2;
        double a8 = a4*a4;
        resw.setText("Ответ:" + "A2=" + String.format("%.2f",a2) +
                "\n" + "A4="+ String.format("%.2f",a4) + "\n" + "A8="+String.format("%.2f",a8));
    }
}