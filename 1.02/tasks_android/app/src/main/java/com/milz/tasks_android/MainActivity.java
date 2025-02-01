package com.milz.tasks_android;

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

public class MainActivity extends AppCompatActivity {
    EditText AeditText, BditText;
    TextView resView;
    Button resbutton, nextButton;

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        AeditText = findViewById(R.id.AeditText);
        BditText = findViewById(R.id.BditText);
        resView = findViewById(R.id.resView);
        resbutton = findViewById(R.id.resbutton);
        nextButton = findViewById(R.id.nextButton);

        resbutton.setOnClickListener(v -> check());
        nextButton.setOnClickListener(v -> next());
    }

    private void next() {
        Intent intent =new Intent(this, SecontActivity.class);
        startActivity(intent);
    }

    private void check() {
        String aStr = AeditText.getText().toString();
        String bStr = BditText.getText().toString();
        try {
            double a = Double.parseDouble(aStr);
            double b = Double.parseDouble(bStr);
            StringBuilder progression = new StringBuilder();
            for (double i = 0; i <= a; i += b) {
                progression.append(String.format("%.2f",i)).append(" ");
            }
            resView.setText(progression.toString());
        } catch (NumberFormatException e) {
            resView.setText("Ошибка: Некорректный ввод.");
        }
    }
}