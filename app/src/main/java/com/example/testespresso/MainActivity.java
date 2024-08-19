package com.example.testespresso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button reset,cambiar,aceptar;
    EditText textoOriginal;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset=findViewById(R.id.buttonReset);
        cambiar=findViewById(R.id.buttonCambiar);
        aceptar=findViewById(R.id.buttonAceptar);

        resultado=findViewById(R.id.textViewResultado);
        textoOriginal=findViewById(R.id.editTextTextoOriginal);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoOriginal.setText("Limpiado");
            }
        });

        cambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(textoOriginal.getText());
            }
        });
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("texto",textoOriginal.getText().toString());
                startActivity(intent);
            }
        });
    }
}