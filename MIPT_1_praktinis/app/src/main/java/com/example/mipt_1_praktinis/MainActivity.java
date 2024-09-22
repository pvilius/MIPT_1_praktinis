package com.example.mipt_1_praktinis;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btnChangeText;
    Button btnChangeColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnChangeText = (Button)findViewById(R.id.btnChangeText);
        tvMain = (TextView)findViewById(R.id.tvMain);

        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText("Hello");
            }
        });

        btnChangeColour = (Button)findViewById(R.id.btnChangeColour);
        btnChangeColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setTextColor(Color.parseColor("#BF0A30"));
            }
        });
    }
}
