package com.example.controldeclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int entranCont = 0;
    private int salenCont = 0;
    private TextView entran = findViewById(R.id.entran);
    private TextView salen = findViewById(R.id.salen);
    private Button addEntran = findViewById(R.id.btn_entran);
    private Button addSalen = findViewById(R.id.btn_salen);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addEntran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entranCont++;
                entran.setText(entranCont);
            }
        });

        addSalen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salenCont++;
                salen.setText(salenCont);
            }
        });
    }
}
