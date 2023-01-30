package com.example.ejerciciospoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText capital, tasa, tiempo;
    //Interes generado y el acumulado
    TextView interes, acumulado;
    //Agregamos los botones
    Button nuevo, calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciar variables
        //-----Hacer referencia a los controles de la actividad -----
        capital = findViewById(R.id.txtcapital);
        tasa = findViewById(R.id.txttasa);
        tiempo = findViewById(R.id.txttiempo);
        interes = findViewById(R.id.lblinteres);
        acumulado = findViewById(R.id.lblacumulado);
        nuevo = findViewById(R.id.btnnuevo);
        calcular = findViewById(R.id.btncalcular);
        this.setTitle("Interés Simple");

        //---- Botón Calcular ----
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ca = Float.valueOf(capital.getText().toString()).floatValue();
                float ta = Float.valueOf(tasa.getText().toString()).floatValue();
                float ti = Float.valueOf(tiempo.getText().toString()).floatValue();
                InteresSimple objeto = new InteresSimple(ca,ti,ta);
                interes.setText(String.format("%,.2f", objeto.Interes()));

                acumulado.setText(String.format("%,.2f", objeto.Acumulado()));
            }
        });

                // --- Boton nuevo ---
                nuevo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        capital.setText("");
                        tiempo.setText("");
                        tasa.setText("");
                        interes.setText("0.00");
                        acumulado.setText("0.00");
                        capital.requestFocus();
                    }
                });
    }
}