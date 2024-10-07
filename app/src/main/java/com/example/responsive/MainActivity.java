package com.example.responsive;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button miBotonA, miBotonB, miBotonC, miBotonD, miBotonE, miBotonF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        miBotonA = (Button)findViewById(R.id.btnA);
        miBotonB = (Button)findViewById(R.id.btnB);
        miBotonC = (Button)findViewById(R.id.btnC);
        miBotonD = (Button)findViewById(R.id.btnD);
        miBotonE = (Button)findViewById(R.id.btnE);
        miBotonF = (Button)findViewById(R.id.btnF);

        miBotonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Botón A", Toast.LENGTH_SHORT).show();
            }
        });
    }
}