package com.milz.tasks_android;

import static java.lang.Math.pow;

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

public class LastActivity extends AppCompatActivity {
    EditText xedit, yedit, redit, amedit, anedit, aedit;
    TextView resview;
    Button resbutton, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_last);
        xedit = findViewById(R.id.xedit);
        yedit = findViewById(R.id.yedit);
        redit = findViewById(R.id.redit);
        amedit = findViewById(R.id.amedit);
        anedit = findViewById(R.id.anedit);
        aedit = findViewById(R.id.aedit);
        resview = findViewById(R.id.resview);
        resbutton = findViewById(R.id.resbutton);
        button2 = findViewById(R.id.button2);

        resbutton.setOnClickListener(v -> check());
        button2.setOnClickListener(v -> back());
    }

    private void back() {
        Intent intent = new Intent(this, SecontActivity.class);
        startActivity(intent);
    }

    private void check() {
        String am = amedit.getText().toString();
        String an = anedit.getText().toString();
        String a = aedit.getText().toString();
        String x = xedit.getText().toString();
        String y = yedit.getText().toString();
        String r = redit.getText().toString();
        Double ame = Double.parseDouble(am);
        Double ane = Double.parseDouble(an);
        Double ad = Double.parseDouble(a);
        Double xe = Double.parseDouble(x);
        Double ye = Double.parseDouble(y);
        Double re = Double.parseDouble(r);

        if (pow(ame + xe, 2) + pow(ane + ye, 2) <= pow(re, 2) && pow(ame + xe, 2) + pow(ane - ad + ye, 2) <= pow(re, 2) && pow(ame - ad + xe, 2) + pow(ane - ad + ye, 2) <= pow(re, 2) && pow(ame - ad + xe, 2) + pow(ane + ye, 2) <= pow(re, 2)) {
            resview.setText("принадлежит");
        } else {
            resview.setText("не принадлежит");

        }

    }
}