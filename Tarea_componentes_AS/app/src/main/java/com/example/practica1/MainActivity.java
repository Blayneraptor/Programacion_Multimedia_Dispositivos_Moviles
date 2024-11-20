package com.example.practica1; // Asegúrate de que coincida con tu nombre de paquete

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias de los elementos
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);

        // Configurar el evento de clic del botón
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambiar el texto de los TextViews cuando el botón sea presionado
                textView1.setText("Alumno en Digitech");
                textView2.setText("Segundo curso de DAM");
            }
        });
    }
}
