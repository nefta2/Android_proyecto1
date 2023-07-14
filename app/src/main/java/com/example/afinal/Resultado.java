package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class  Resultado extends AppCompatActivity {
    TextView resultado_final;
    Button btn_repetir;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        imagen = findViewById(R.id.imagenFinal);
        resultado_final = findViewById(R.id.resultado);
        float resultadoF = getIntent().getFloatExtra("resultado", 0.0f);

        if (resultadoF>70){
            imagen.setImageResource(R.drawable.good);
        } else {
            imagen.setImageResource(R.drawable.bad);
        }
        resultado_final.setText(String.valueOf((int) resultadoF) + "%");

        View Button = findViewById(R.id.btn_repetir);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the SecondActivity
                Intent intent = new Intent(Resultado.this, Home.class);
                startActivity(intent);
            }
        });
    }
}