package com.example.controldeclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int entranCont;
    int salenCont;
    TextView entran;
    TextView salen;
    Button addEntran;
    Button addSalen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entranCont = 0;
        salenCont = 0;
        entran= findViewById(R.id.entran);
        salen  = findViewById(R.id.salen);
        addEntran= findViewById(R.id.btn_entran);
        addSalen = findViewById(R.id.btn_salen);

        addEntran.setOnClickListener(this);
        addSalen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        Log.i("id", viewId+"");
        switch (viewId){
            case R.id.btn_entran:
                entranCont++;
                entran.setText(Integer.toString(entranCont));
                break;
            case R.id.btn_salen:
                salenCont++;
                salen.setText(Integer.toString(salenCont));
                break;

        }
    }
}
