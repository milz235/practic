package com.milz.tasks_android;

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

public class SecontActivity extends AppCompatActivity {
    EditText AeditText, BeditText, CeditText;
    TextView resView;
     Button  resbutton, backbutton, nextbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secont);
        AeditText = findViewById(R.id.AeditText);
        BeditText = findViewById(R.id.BeditText);
        CeditText = findViewById(R.id.CeditText);
        resView = findViewById(R.id.resView);
        resbutton = findViewById(R.id.resbutton);
        backbutton = findViewById(R.id.backbutton);
        nextbutton = findViewById(R.id.nextbutton);

        resbutton.setOnClickListener(v->check());
        backbutton.setOnClickListener(v->back());
        nextbutton.setOnClickListener(v->next());
    }

    private void check() {
        String aStr = AeditText.getText().toString();
        String bStr = BeditText.getText().toString();
        String cStr = CeditText.getText().toString();
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);
        double pr1 = a * b;
        double pr2 = b * c;
        double[] pr = {pr1,pr2};
        java.util.Arrays.sort(pr);
        resView.setText("В порядке возрастания:" + pr[0]+pr[1]);
    }

    private void next() {
        Intent intent = new Intent(this, LastActivity.class);
        startActivity(intent);
    }

    private void back() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}